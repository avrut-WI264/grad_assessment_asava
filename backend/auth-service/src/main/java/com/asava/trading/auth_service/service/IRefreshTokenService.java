package com.asava.trading.auth_service.service;

import com.asava.trading.auth_service.entity.RefreshToken;
import com.asava.trading.auth_service.entity.User;

public interface IRefreshTokenService {
    RefreshToken createRefreshToken(User user);
    RefreshToken verifyRefreshToken(String token);
    void revokeAllUserTokens(User user);
}