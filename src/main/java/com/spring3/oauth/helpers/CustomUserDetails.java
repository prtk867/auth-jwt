package com.spring3.oauth.helpers;

import com.spring3.oauth.models.UserInfo;
import com.spring3.oauth.models.UserRole;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomUserDetails implements UserDetails {

    private String username;
    private String password;
    Collection<? extends GrantedAuthority> authorities;
    public CustomUserDetails(UserInfo user) {
        this.username = user.getUsername();
        this.password=user.getPassword();
        List<GrantedAuthority> auth = new ArrayList<>();

        for(UserRole role : user.getRoles()){

            auth.add(new SimpleGrantedAuthority(role.getName().toUpperCase()));
        }
        this.authorities=auth;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
