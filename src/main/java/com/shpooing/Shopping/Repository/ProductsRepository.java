package com.shpooing.Shopping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shpooing.Shopping.Model.Products;

public interface ProductsRepository extends JpaRepository<Products, Integer>{

}
