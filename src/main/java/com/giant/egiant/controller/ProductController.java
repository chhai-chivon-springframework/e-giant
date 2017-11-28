package com.giant.egiant.controller;

import com.giant.egiant.models.Product;
import com.giant.egiant.services.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by chhai.chivon  on 11/28/2017.
 */
@RestController
@RequestMapping("/api/movies")
@Api("/api/movies")
public class ProductController {

    private ProductService productService;
    private MessageSource messageSource;

    @Autowired
    public ProductController(ProductService productService, MessageSource messageSource) {
        this.productService = productService;
        this.messageSource = messageSource;
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Find all movies", notes = "Retrieving the collection of movies", response = Product[].class)
    @ApiResponses({
            @ApiResponse(code = 200, message = "Success", response = Product[].class)
    })
    public Page<Product> findAll(){
        return productService.findAll(new PageRequest(1,2));
    }
}