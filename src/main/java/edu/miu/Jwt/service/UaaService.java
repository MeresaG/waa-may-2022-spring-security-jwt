package edu.miu.Jwt.service;

import edu.miu.Jwt.model.LoginRequest;
import edu.miu.Jwt.model.LoginResponse;
import edu.miu.Jwt.model.RefreshTokenRequest;

public interface UaaService {
    LoginResponse login(LoginRequest loginRequest);
    LoginResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
