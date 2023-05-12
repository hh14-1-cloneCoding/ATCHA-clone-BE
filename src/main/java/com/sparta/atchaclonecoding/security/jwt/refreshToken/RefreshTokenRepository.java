package com.sparta.atchaclonecoding.security.jwt.refreshToken;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RefreshTokenRepository  extends JpaRepository<RefreshToken, Long> {
    Optional<RefreshToken> findByEmail(String Email);

    void deleteByEmail(String Email);

}