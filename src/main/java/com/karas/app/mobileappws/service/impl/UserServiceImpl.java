package com.karas.app.mobileappws.service.impl;

import com.karas.app.mobileappws.repository.UserRepository;
import com.karas.app.mobileappws.io.entity.UserEntity;
import com.karas.app.mobileappws.service.UserService;
import com.karas.app.mobileappws.shared.dto.UserDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto user) {
        UserEntity userEntity = new UserEntity();

        BeanUtils.copyProperties(user, userEntity);

        // TODO: Hardcoded password and id, should be removed later.
        userEntity.setEncryptedPassword("test");
        userEntity.setUserId("testUserId");
        //

        UserEntity storedUserDetails = userRepository.save(userEntity);

        UserDto returnValue = new UserDto();
        BeanUtils.copyProperties(storedUserDetails, returnValue);

        return returnValue;
    }
}
