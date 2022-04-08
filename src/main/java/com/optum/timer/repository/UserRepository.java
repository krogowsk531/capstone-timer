package com.optum.timer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.optum.timer.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
