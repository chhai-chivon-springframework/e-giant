package com.giant.egiant.common;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * @author by chhai.chivon  on 11/27/17.
 */
public interface BaseService<T> {

    Page<T> findAll(PageRequest pageRequest);

    T findOne(Long id);

    void saveOrUpdate(T entity);

    void delete(T entity);

}
