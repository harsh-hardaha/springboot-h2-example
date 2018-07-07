package com.harsh.springframework.services;

import org.springframework.data.domain.Page;

import com.harsh.springframework.domain.Product;

/**
 * Created by jt on 1/10/17.
 */
public interface ProductService {

   
	Page<Product> searchProductNoError();

	Page<Product> searchProductWithError();
}
