package com.adsonweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adsonweb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
