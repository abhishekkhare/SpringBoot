package com.abhi.spring.edu.springboot.helper;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.apache.commons.beanutils.PropertyUtils;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.UUIDGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class checks if the existing object contains a valid uuid for the CREATE operation. If it
 * contains a valid uuid, it will use the uuid as the ID. If the id is not exists or invalid, this
 * will generate a new UUID before persist the object.
 *
 * In order to use this Generator, the field must have two annotations. * @Id and @GeneratedValue *
 * declare this class in the strategy field.
 *
 * eg.
 *
 * @Id
 * @Column(name = "UUID")
 * @GeneratedValue(generator = "UUID")
 * @GenericGenerator(name = "UUID", strategy = "com.abhi.spring.edu.springboot.helper.FallBackUUIDGenerator")
 * private String uuid;
 */
public class FallBackUUIDGenerator extends UUIDGenerator {

    private final Logger log = LoggerFactory.getLogger(FallBackUUIDGenerator.class);

    public static boolean isValidUuid(String id) {
        if (id == null) {
            return false;
        } else if (id.length() != 36) {
            return false;
        } else {
            try {
                UUID.fromString(id); //for validation only
                return true;
            } catch (IllegalArgumentException e) {
                return false;
            }
        }
    }


    public Serializable generate(SessionImplementor session, Object object)
            throws HibernateException {
        String fieldName = "";
        Serializable id = null;
        Set<Field> set = new HashSet<>();
        Class<?> c = object.getClass();
        while (c != null) {
            for (Field field : c.getDeclaredFields()) {
                if (field.isAnnotationPresent(Id.class)) {
                    if (field.isAnnotationPresent(GeneratedValue.class)) {
                        set.add(field);
                    }

                }
            }
            c = c.getSuperclass();
        }
        if (set.size() == 1) {
            fieldName = set.iterator().next().getName();
            try {
                id = (Serializable) PropertyUtils.getSimpleProperty(object, fieldName);

                if (isValidUuid((String) id)) {
                    return id;
                } else {
                    return super.generate(session, object);
                }
            } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                log.error("Cannot retrieve the value of {}, is there a getter method available?",
                        fieldName);
                throw new HibernateException(e);
            }
        } else {
            log.warn("cannot determine the UUID field. generate a new UUID");
            return super.generate(session, object);
        }
    }
}
