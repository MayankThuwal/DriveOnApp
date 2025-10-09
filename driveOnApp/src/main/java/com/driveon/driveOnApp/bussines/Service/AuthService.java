package com.driveon.driveOnApp.bussines.Service;

import com.driveon.driveOnApp.bussines.IService.IAuthService;
import com.driveon.driveOnApp.dto.DriverDTO;
import com.driveon.driveOnApp.dto.SignUpDTO;
import com.driveon.driveOnApp.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public class AuthService implements IAuthService {

    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDTO signup(SignUpDTO signUpDTO) {
        return null;
    }

    @Override
    public DriverDTO onboardNewDriver(Long userId) {
        return null;
    }
}
