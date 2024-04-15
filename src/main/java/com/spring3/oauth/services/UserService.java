package com.spring3.oauth.services;

import com.spring3.oauth.dtos.UserRequest;
import com.spring3.oauth.dtos.UserResponse;

import java.util.List;

public interface UserService {
    UserResponse saveUser(UserRequest userRequest);

    UserResponse getUser();

    List<UserResponse> getAllUser();

}
