package com.cg.spring.project.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.spring.project.beans.Cart;


@Repository
public interface CartRepo extends CrudRepository<Cart, Integer> {

}
