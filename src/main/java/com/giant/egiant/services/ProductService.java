package com.giant.egiant.services;

import com.giant.egiant.common.BaseService;
import com.giant.egiant.models.Product;
import com.giant.egiant.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


/**
 * @author by chhai.chivon  on 11/27/17.
 */
@Service
@Scope("prototype")
public class ProductService implements BaseService<Product> {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public Page<Product> findAll(PageRequest pageRequest) {
        return productRepository.findAll(pageRequest);
    }

    @Override
    public Product findOne(Long id) {
        return productRepository.findOne(id);
    }

    @Override
    public void saveOrUpdate(Product entity) {
        productRepository.save(entity);
    }

    @Override
    public void delete(Product entity) {
        productRepository.delete(entity);
    }
}
