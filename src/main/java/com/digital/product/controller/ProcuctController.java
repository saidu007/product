package com.digital.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digital.product.model.Product;
import com.digital.product.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProcuctController {

	@Autowired
	private ProductService productService;
	
	@GetMapping(value = "")
	public List<Product> getProducts(){
		return productService.getProducts();
	}
	
	@GetMapping(value = "{productId}")
	public Product getProductById(@PathVariable String productId){
		return productService.getProductById(productId);
	}
}
