package com.harsh.springframework.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.harsh.springframework.domain.Address;
import com.harsh.springframework.domain.Country;
import com.harsh.springframework.domain.Location;
import com.harsh.springframework.domain.Product;
import com.harsh.springframework.repositories.ProductRepository;

/**
 * Created by jt on 1/10/17.
 */
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
    private ProductRepository productRepository;
    
    @Override
    public Page<Product> searchProductWithError() {
    	Pageable pageable = new PageRequest(0, 4);
    	
    	Product product = new Product();
    	product.setDescription("top");
    	Address adress = new Address();
    	Location location = new Location();
    	
    	Country country = new Country();
    	location.setCountry(country);
    	country.setName("france");
    	adress.setMylocation(location);
    	product.setAddress(adress);
    	
    	//product.setDescription("top");
    	ExampleMatcher exampleMatcher = ExampleMatcher.matching();
    	
    	
    	exampleMatcher = ExampleMatcher.matching()
                .withIgnoreNullValues()
                .withIgnoreCase()
                .withMatcher("address.mylocation.country.name", match -> match.contains());  
    	
    	exampleMatcher = exampleMatcher.withIgnoreNullValues()
                .withIgnoreCase()
                .withMatcher("description", match -> match.contains()); 
    	
    	
    	
    	Example<Product> example = Example.of(product, exampleMatcher);
    	
        Page<Product> page = productRepository.findAll(example, pageable);
        		
        		

        return page;
    }

	@Override
	public Page<Product> searchProductNoError() {
    	Pageable pageable = new PageRequest(0, 4);
    	
    	Product product = new Product();
    	product.setDescription("top");
    	
    	ExampleMatcher exampleMatcher = ExampleMatcher.matching();
    	
    	
    	exampleMatcher = exampleMatcher.withIgnoreNullValues()
                .withIgnoreCase()
                .withMatcher("description", match -> match.contains()); 
    	
    	
    	
    	Example<Product> example = Example.of(product, exampleMatcher);
    	
        Page<Product> page = productRepository.findAll(example, pageable);
        		
        		

        return page;
    }
}
