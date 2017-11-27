package com.giant.egiant.services;

import com.giant.egiant.common.BaseService;
import com.giant.egiant.models.Category;
import com.giant.egiant.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import sun.rmi.runtime.Log;

/**
 * @author by chhai.chivon  on 11/27/17.
 */
@Service
@Scope("prototype")
public class CategoryService implements BaseService<Category> {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Page<Category> findAll(PageRequest pageRequest) {
        return categoryRepository.findAll(pageRequest);
    }

    @Override
    public Category findOne(Long id) {
        return categoryRepository.findOne(id);
    }

    @Override
    public void saveOrUpdate(Category entity) {
        categoryRepository.save(entity);
    }

    @Override
    public void delete(Category entity) {
        categoryRepository.delete(entity);
    }
}
