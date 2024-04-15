package com.spring3.oauth.services;

import com.spring3.oauth.dtos.UserRequest;
import com.spring3.oauth.dtos.UserResponse;
import com.spring3.oauth.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public UserResponse saveUser(UserRequest userRequest) {
        return null;
    }

    @Override
    public UserResponse getUser() {
        return null;
    }

    @Override
    public List<UserResponse> getAllUser() {
        return null;
    }
}
