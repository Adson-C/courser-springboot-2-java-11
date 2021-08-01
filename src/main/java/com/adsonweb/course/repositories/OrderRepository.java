package com.adsonweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adsonweb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
