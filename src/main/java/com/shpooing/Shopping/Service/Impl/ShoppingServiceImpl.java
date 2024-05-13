package com.shpooing.Shopping.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shpooing.Shopping.DAO.ShoppingDAO;
import com.shpooing.Shopping.Model.Products;
import com.shpooing.Shopping.Service.ShoppingService;

@Service
public class ShoppingServiceImpl implements ShoppingService {

	@Autowired
	ShoppingDAO shoppingDAO;
	@Override
	public List<Products> getAllProducts() {
		return shoppingDAO.getAllProducts();
	}

}
