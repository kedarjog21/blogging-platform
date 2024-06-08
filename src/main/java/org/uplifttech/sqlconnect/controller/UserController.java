package org.uplifttech.sqlconnect.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.uplifttech.sqlconnect.records.UserCreationRequest;
import org.uplifttech.sqlconnect.service.UserService;

@RestController
@Slf4j
@RequestMapping(value = "/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public void createUser(@RequestBody UserCreationRequest userCreationRequest){
        log.info("User creation request : {}",userCreationRequest);
        userService.createUser(userCreationRequest);
    }


}
