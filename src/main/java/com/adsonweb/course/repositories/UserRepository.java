package com.adsonweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adsonweb.course.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
