package com.optum.timer.service;

import com.optum.timer.model.User;
import com.optum.timer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsImpl implements UserDetails{

    private UserRepository userRepository;

    @Autowired
    public UserDetailsImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void saveUser(User user) {
        this.userRepository.save(user);
    }
}
