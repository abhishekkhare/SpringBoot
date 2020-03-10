package com.abhi.spring.edu.springboot.helper;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.jpa.repository.EntityGraph;

import java.io.Serializable;
import java.util.List;

@NoRepositoryBean
public interface BaseJpaDao<T, ID extends Serializable> extends JpaRepository<T, ID>,
        JpaSpecificationExecutor<T> {

    Page<T> findAll(Specification<T> spec, Pageable pageable, EntityGraph.EntityGraphType entityGraphType,
                    String entityGraphName);

    List<T> findAll(Specification<T> spec, EntityGraph.EntityGraphType entityGraphType, String entityGraphName);

    T findOne(Specification<T> spec, EntityGraph.EntityGraphType entityGraphType, String entityGraphName);

    T findOne(ID id, EntityGraph.EntityGraphType entityGraphType, String entityGraphName);

    T getOne(ID id, EntityGraph.EntityGraphType entityGraphType, String entityGraphName);
}
