package com.application.sahayi.mapper;

import com.application.sahayi.entity.User;
import com.application.sahayi.model.request.RegistrationRequest;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UserMapper {

    public static User constructUser(RegistrationRequest registrationRequest) {
        User user = new User();
        user.setFirstName(registrationRequest.getFirstName());
        user.setLastName(registrationRequest.getLastName());
        user.setPhone(Integer.getInteger(registrationRequest.getPhone()));
        user.setPinCode(Integer.getInteger(registrationRequest.getPinCode()));
        user.setPassword(registrationRequest.getPassword());
        user.setUserId(UUID.randomUUID().toString());
        return user;
    }
}
