package com.giant.egiant.common;

import com.giant.egiant.services.CategoryService;
import com.giant.egiant.services.ProductService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @author by chhai.chivon  on 11/27/17.
 */
@Service
public interface ServiceHelper extends Serializable {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});

    CategoryService CATEGORY_SERVICE = (CategoryService) context.getBean("CategoryService");

    ProductService PRODUCT_SERVICE = (ProductService) context.getBean("ProductService");

}