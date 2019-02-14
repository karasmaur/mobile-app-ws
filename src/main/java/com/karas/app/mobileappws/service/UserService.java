package com.karas.app.mobileappws.service;

import com.karas.app.mobileappws.shared.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto user);
    UserDto updateUser(String id, UserDto user);
    void deleteUser(String userId);
    UserDto getUser(String email);
    List<UserDto> getUsers(int page, int limit);
    UserDto getUserByUserId(String id);
}
