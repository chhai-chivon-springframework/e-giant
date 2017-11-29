package com.giant.egiant.controller;

import com.giant.egiant.common.BaseController;
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
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author by chhai.chivon  on 11/28/2017.
 */
@RestController
@RequestMapping("/api/products")
@Api("/api/products")
public class ProductController extends BaseController<Product> {

    private ProductService productService;
    private MessageSource messageSource;
    public Map<String, Object> map;


    @Autowired
    public ProductController(ProductService productService, MessageSource messageSource) {
        this.productService = productService;
        this.messageSource = messageSource;
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "Find all products", notes = "Retrieving the collection of products", response = Product[].class)
    @ApiResponses({
            @ApiResponse(code = 200, message = "Success", response = Product[].class)
    })
    public ResponseEntity<Map<String, Object>> findAll(
            @RequestParam(value = "page", required = false, defaultValue = "0") int page,
            @RequestParam(value = "limit", required = false, defaultValue = "15") int limit
    ){
        Page<Product> products= null;
        try {
            products =  productService.findAll(new PageRequest(page,limit));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Error" + e.getMessage());
        }
        return responseJson(products, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "Find product", notes = "Retrieving the collection of product", response = Product.class)
    @ApiResponses({
            @ApiResponse(code = 200, message = "Success", response = Product.class)
    })
    public ResponseEntity<Map<String, Object>> findById(@PathVariable("id") Long id) {
        map = new HashMap<>();
        Product product = null;
        try {
            product = productService.findOne(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseJson(product,HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.POST, headers = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Save product", notes = "Insert the collection of product", response = Product.class)
    @ApiResponses({
            @ApiResponse(code = 200, message = "Success", response = Product.class)
    })
    public ResponseEntity<Map<String, Object>> save(@RequestBody Product product) {
        map = new HashMap<>();
        try {
            productService.saveOrUpdate(product);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseJson(product,HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, headers = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Update products", notes = "Update the collection of product", response = Product.class)
    @ApiResponses({
            @ApiResponse(code = 200, message = "Success", response = Product.class)
    })
    public ResponseEntity<Map<String, Object>> update(@PathVariable("id") Long id, @RequestBody Product product){
        map = new HashMap<>();
        try {
            if(productService.findOne(id) != null){
                productService.saveOrUpdate(product);
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.print(e.getMessage());
        }
        return responseJson(product,HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "Delete products", notes = "Delete the collection of product", response = Product.class)
    @ApiResponses({
            @ApiResponse(code = 200, message = "Success", response = Product.class)
    })
    public ResponseEntity<Map<String, Object>> delete(@PathVariable("id") long id) {
        map = new HashMap<>();
        Product product = productService.findOne(id);
        try {
            if (product != null) {
                productService.delete(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseJson(product, HttpStatus.OK);
    }
}