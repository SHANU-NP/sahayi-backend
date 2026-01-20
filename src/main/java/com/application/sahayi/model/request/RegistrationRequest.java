package com.application.sahayi.model.request;

import lombok.Data;

@Data
public class RegistrationRequest {

    private String firstName;
    private String lastName;
    private String phone;
    private String password;
    private String pinCode;

}
