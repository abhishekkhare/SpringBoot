package com.abhi.spring.edu.springboot.helper;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

import static org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;

public class BaseJpaDaoImpl<T, ID extends Serializable> extends SimpleJpaRepository<T, ID> implements BaseJpaDao<T, ID> {

    private final EntityManager entityManager;

    public BaseJpaDaoImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
        this.entityManager = entityManager;
    }

    @Override
    public Page<T> findAll(Specification<T> spec, Pageable pageable, EntityGraphType entityGraphType, String entityGraphName) {
        return null;
    }

    @Override
    public List<T> findAll(Specification<T> spec, EntityGraphType entityGraphType, String entityGraphName) {
        return null;
    }

    @Override
    public T findOne(Specification<T> spec, EntityGraphType entityGraphType, String entityGraphName) {
        return null;
    }

    @Override
    public T findOne(ID id, EntityGraphType entityGraphType, String entityGraphName) {
        return null;
    }

    @Override
    public T getOne(ID id, EntityGraphType entityGraphType, String entityGraphName) {
        return null;
    }
}