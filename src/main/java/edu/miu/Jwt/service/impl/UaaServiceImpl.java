package edu.miu.Jwt.service.impl;

import edu.miu.Jwt.model.LoginRequest;
import edu.miu.Jwt.model.LoginResponse;
import edu.miu.Jwt.model.RefreshTokenRequest;
import edu.miu.Jwt.security.JwtHelper;
import edu.miu.Jwt.service.UaaService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UaaServiceImpl implements UaaService {


    private final AuthenticationManager authenticationManager;
    private final UserDetailsService userDetailsService;
    private final JwtHelper jwtHelper;

    @Override
    public LoginResponse login(LoginRequest loginRequest) {

        return null;
    }

    @Override
    public LoginResponse refreshToken(RefreshTokenRequest refreshTokenRequest) {

        return null;
    }

}
