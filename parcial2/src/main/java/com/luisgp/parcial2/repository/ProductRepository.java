package com.luisgp.parcial2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luisgp.parcial2.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
