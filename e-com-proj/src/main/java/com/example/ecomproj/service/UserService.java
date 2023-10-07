package com.example.ecomproj.service;

import com.example.ecomproj.models.User;
import com.example.ecomproj.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public String addUser(String name, String email, String pasword) {
        User user = User.builder()
                .username(name)
                .email(email)
                .password(pasword)
                .build();
        userRepository.save(user);
        return "User Saved Successfully!!";
    }
}
