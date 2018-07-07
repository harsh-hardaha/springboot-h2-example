package com.harsh.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.harsh.springframework.domain.Product;
import com.harsh.springframework.services.ProductService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by jt on 1/10/17.
 */
@RestController
@RequestMapping({"/product"})
@EnableSwagger2
public class ProductController {
	
	@Autowired
    private ProductService productService;

    
    @RequestMapping(value = {"/searchNoError"},method = RequestMethod.GET,
            produces = {"application/json"})
    public ResponseEntity<Page<Product>> searchProductsNoError(){
        Page<Product> page = productService.searchProductNoError();
        
        return new ResponseEntity<Page<Product>>(page, HttpStatus.OK);
    }
    
    @RequestMapping(value = {"/searchWithError"},method = RequestMethod.GET,
            produces = {"application/json"})
    public ResponseEntity<Page<Product>> searchProductsWithError(){
        Page<Product> page = productService.searchProductWithError();
        
        return new ResponseEntity<Page<Product>>(page, HttpStatus.OK);
    }
}
