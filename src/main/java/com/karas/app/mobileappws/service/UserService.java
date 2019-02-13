package com.karas.app.mobileappws.service;

import com.karas.app.mobileappws.shared.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto user);
    UserDto updateUser(String id, UserDto user);
    UserDto getUser(String email);
    UserDto getUserByUserId(String id);
}
