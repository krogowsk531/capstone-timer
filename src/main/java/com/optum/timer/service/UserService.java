package com.optum.timer.service;

import java.util.List;

import com.optum.timer.model.User;

public interface UserService {
    List < User > getAllUsers();
    void saveUser(User user);
    User getUserById(long id);
    void deleteUserById(long id);
}
