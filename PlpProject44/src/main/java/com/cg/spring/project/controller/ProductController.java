package com.cg.spring.project.controller;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.spring.project.beans.Cart;
import com.cg.spring.project.beans.Product;
import com.cg.spring.project.service.CartService;
import com.cg.spring.project.service.ProductService;

@Controller
public class ProductController {
	int count = 1;
	
	@Autowired
	ProductService service;
	
	@Autowired
	CartService serviceCart;
	
	@RequestMapping("/demoo")
	public String showProductByIdPage() {
		return "demoo";
	}

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public ModelAndView getProducts() {
		Iterable<Product> p1 = service.getAllProducts();
		return new ModelAndView("index", "prod", p1);
	}

	@RequestMapping(value = "/carting/{p_id}", method = RequestMethod.GET)
	public String cartProducts(@PathVariable("p_id") int p_id) {
		Optional<Product> prod = service.getProdById(p_id);
		Iterable<Cart> list = serviceCart.getCartProducts();
		for(Cart cart : list) {
			if(cart.getP_id()==p_id) {
				System.out.println("entering");
				count=cart.getP_quantity();
				count++;
				cart.setP_quantity(count);
				BigDecimal amount=cart.getCartAmount();
				serviceCart.updateCart(cart);
				return "success";
			}
		}
		System.out.println("else then");
		Product pro = prod.get();
		Cart c = new Cart();
		c.setP_id(p_id);
		c.setP_name(pro.getP_name());
		c.setCartAmount(pro.getP_price());
		c.setP_quantity(1);
		serviceCart.addToCart(c);
		return "success";

	}
	
	@RequestMapping(value = "/cart", method = RequestMethod.GET)
	public ModelAndView getCartProducts() {
		Iterable<Cart> c1=serviceCart.getCartProducts();
		return new ModelAndView("cart", "cartProd", c1);
	}

	@RequestMapping(value="/del/{p_id}",method = RequestMethod.GET)
	public String cartProd(@PathVariable("p_id") int p_id) {
		serviceCart.deleteFromCart(p_id);
		return "deletionsuccess";
	}
	@RequestMapping(value="/delall",method = RequestMethod.GET)
	public String delall(Cart c) {
		serviceCart.deleteAllCart(c);
		return "deletionsuccess";
	}
	
}
