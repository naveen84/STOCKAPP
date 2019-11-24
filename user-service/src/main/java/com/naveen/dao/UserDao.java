package com.naveen.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naveen.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

}
