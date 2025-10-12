package com.driveon.driveOnApp.services.impl;

import com.driveon.driveOnApp.services.AuthService;
import com.driveon.driveOnApp.dto.DriverDTO;
import com.driveon.driveOnApp.dto.SignUpDTO;
import com.driveon.driveOnApp.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDTO signup(SignUpDTO signUpDTO)
    {
        return null;
    }

    @Override
    public DriverDTO onboardNewDriver(Long userId) {
        return null;
    }
}
