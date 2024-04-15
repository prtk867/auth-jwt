package com.spring3.oauth.repositories;

import com.spring3.oauth.helpers.RefreshableCRUDRepository;
import com.spring3.oauth.models.UserInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends RefreshableCRUDRepository<UserInfo,Integer> {

    public UserInfo findByUsername(String username);
    UserInfo findFirstById(Long id);
}
