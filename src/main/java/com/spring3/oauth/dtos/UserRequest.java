package com.spring3.oauth.dtos;

import com.spring3.oauth.models.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserRequest {

    private long id;
    private String username;

    private String password;

    private Set<UserRole> roles;
}
