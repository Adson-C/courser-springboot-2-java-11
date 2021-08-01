package com.adsonweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adsonweb.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
