package com.shpooing.Shopping.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shpooing.Shopping.Model.Products;
import com.shpooing.Shopping.Model.User;
import com.shpooing.Shopping.Service.ShoppingService;

@RestController
public class ShoppingController {
	
	@Autowired
	ShoppingService shoppingService;
	

	@GetMapping("/getAllproducts")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Products> getAllProducts() {
		return shoppingService.getAllProducts();
		
	}
	
	@PostMapping("/userRegisteration")
	@CrossOrigin(origins = "http://localhost:4200")
	public void userRegistrion(@RequestBody User user) {
		System.out.println("here");
		
	}

}
