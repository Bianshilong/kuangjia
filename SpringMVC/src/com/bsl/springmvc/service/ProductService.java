package com.bsl.springmvc.service;

import com.bsl.springmvc.domain.Product;

public interface ProductService {

	Product add(Product product);
	Product get(long id);
	
}
