package com.cg.spring.project.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.spring.project.beans.Product;



@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {

}
