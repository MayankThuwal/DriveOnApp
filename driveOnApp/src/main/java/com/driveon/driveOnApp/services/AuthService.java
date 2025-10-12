package com.driveon.driveOnApp.services;

import com.driveon.driveOnApp.dto.DriverDTO;
import com.driveon.driveOnApp.dto.SignUpDTO;
import com.driveon.driveOnApp.dto.UserDTO;

public interface AuthService {
    String login(String email, String password);

    UserDTO signup(SignUpDTO signUpDTO);

    DriverDTO onboardNewDriver(Long userId);
}
