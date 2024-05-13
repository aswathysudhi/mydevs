package com.shpooing.Shopping.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shpooing.Shopping.Model.Products;
import com.shpooing.Shopping.Repository.ProductsRepository;

@Component
public class ShoppingDAO {
	@Autowired
	ProductsRepository productsRepo;
	
	public List<Products> getAllProducts(){
		return productsRepo.findAll();
		
	}
	

}
