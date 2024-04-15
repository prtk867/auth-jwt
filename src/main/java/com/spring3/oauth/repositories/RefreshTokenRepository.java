package com.spring3.oauth.repositories;

import com.spring3.oauth.helpers.RefreshableCRUDRepository;
import com.spring3.oauth.models.RefreshToken;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RefreshTokenRepository extends RefreshableCRUDRepository<RefreshToken,Integer> {
    Optional<RefreshToken> findByToken(String token);
}
