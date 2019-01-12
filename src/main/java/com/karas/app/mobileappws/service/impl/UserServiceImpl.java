package com.karas.app.mobileappws.service.impl;

import com.karas.app.mobileappws.repository.UserRepository;
import com.karas.app.mobileappws.io.entity.UserEntity;
import com.karas.app.mobileappws.service.UserService;
import com.karas.app.mobileappws.shared.dto.UserDto;
import com.karas.app.mobileappws.shared.dto.Utils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    Utils utils;

    @Override
    public UserDto createUser(UserDto user) {

        if(userRepository.findByEmail(user.getEmail()) != null)
            throw new RuntimeException("Record already exists");

        UserEntity userEntity = new UserEntity();

        BeanUtils.copyProperties(user, userEntity);

        // TODO: Hardcoded password, should be implemented later.
        userEntity.setEncryptedPassword("test");
        //

        userEntity.setUserId(utils.generateUserId(30));

        UserEntity storedUserDetails = userRepository.save(userEntity);

        UserDto returnValue = new UserDto();
        BeanUtils.copyProperties(storedUserDetails, returnValue);

        return returnValue;
    }
}
