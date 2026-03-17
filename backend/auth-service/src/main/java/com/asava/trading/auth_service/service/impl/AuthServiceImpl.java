package com.asava.trading.auth_service.service.impl;

import com.asava.trading.auth_service.exception.UserNotFoundException;
import com.asava.trading.auth_service.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public String login(String username, String password) {

        if (username == null || password == null) {
            throw new RuntimeException("Invalid credentials");
        }

        if (!username.equals("admin")) {
            throw new UserNotFoundException("User not found");
        }

        return "Login Successful";
    }
}