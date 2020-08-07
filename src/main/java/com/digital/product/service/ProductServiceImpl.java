package com.digital.product.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.digital.product.model.Product;

@Service
public class ProductServiceImpl implements ProductService{

	@Override
	public List<Product> getProducts(){
		List<Product> l = new ArrayList<Product>();
		l.add(sampleProduct());
		l.add(sampleProduct());
		l.add(sampleProduct());
		l.add(sampleProduct());
		return l;
	}
	
	@Override
	public Product getProductById(String id){
		return sampleProduct();
	}
	
	private Product sampleProduct() {
		Product p = new Product();
		p.id = UUID.randomUUID().toString();
		p.name = "someproductname";
		p.price = 12.99;
		p.expiryDate = new java.util.Date().toString();
		return p;
	}
}
