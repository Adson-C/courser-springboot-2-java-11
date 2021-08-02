package com.adsonweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adsonweb.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
