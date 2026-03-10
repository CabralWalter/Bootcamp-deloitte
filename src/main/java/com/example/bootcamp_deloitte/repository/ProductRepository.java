package com.example.bootcamp_deloitte.repository;

import com.example.bootcamp_deloitte.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}