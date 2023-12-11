package com.company.singleresp;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
public class UserController {

    private UserService userService;
    ObjectMapper mapper;
    UserValidator validator;

    public UserController() {
        userService = new UserService();
        mapper = new ObjectMapper();
        validator = new UserValidator();
    }

    public String createUser(String userJson) throws IOException {
        User user = mapper.readValue(userJson, User.class);

        boolean valid = validator.validateUser(user);
        if(!valid) {
            return "ERROR";
        }

        userService.saveUser(user);
        return "SUCCESS";
    }

    public User getUser(String userName) throws IOException {
        return userService.getUser(userName); 
    }

}