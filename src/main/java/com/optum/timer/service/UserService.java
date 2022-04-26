package com.optum.timer.service;

import java.util.List;

import com.optum.timer.security.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;


import com.optum.timer.model.User;

public interface UserService extends UserDetailsService {
    List < User > getAllUsers();
    void registerUser(User user);
    User getUserById(long id);
    void deleteUserById(long id);
    User findByEmail(String email);
    User save(UserRegistrationDto registration);
}
