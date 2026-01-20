package com.application.sahayi.service;

import com.application.sahayi.entity.User;
import com.application.sahayi.mapper.UserMapper;
import com.application.sahayi.model.request.RegistrationRequest;
import com.application.sahayi.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final UserRepository userRepository;

    public UserService(BCryptPasswordEncoder bCryptPasswordEncoder, UserRepository userRepository) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.userRepository = userRepository;
    }

    public void createUser(RegistrationRequest registrationRequest) {

        User newUser = UserMapper.constructUser(registrationRequest);
        newUser.setPassword(bCryptPasswordEncoder.encode(newUser.getPassword()));
        userRepository.save(newUser);
    }


}
