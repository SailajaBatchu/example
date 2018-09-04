package com.cg.spring.project.service;

import java.util.Optional;

import com.cg.spring.project.beans.Product;


public interface ProductService {

	
//	public void addProduct(Product p);
//	public void deleteProduct(int p_id);
	public Iterable<Product> getAllProducts();
	public Optional<Product> getProdById(int p_id);
}
