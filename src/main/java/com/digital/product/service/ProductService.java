package com.digital.product.service;

import java.util.List;

import com.digital.product.model.Product;

public interface ProductService {

	public List<Product> getProducts();
	
	public Product getProductById(String id);
}
