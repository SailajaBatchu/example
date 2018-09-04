package com.cg.spring.project.service;

import com.cg.spring.project.beans.Cart;

public interface CartService {

	public void addToCart(Cart c);
	public void deleteFromCart(int p_id);
	public Iterable<Cart> getCartProducts();
	public boolean isAvailable(int p_id);
	public void getCartProductById(int p_id);
	public void updateCart(Cart c);
	public void deleteAllCart(Cart c);
	
}
