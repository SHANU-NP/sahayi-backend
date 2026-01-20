package com.application.sahayi.controller;

import com.application.sahayi.model.request.RegistrationRequest;
import com.application.sahayi.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/hello")
    public String helloUser() {
        return "Hello, User!";
    }

    @PostMapping("/register")
    public void createUser(@RequestBody RegistrationRequest registrationRequest){
        userService.createUser(registrationRequest);
    }


}
