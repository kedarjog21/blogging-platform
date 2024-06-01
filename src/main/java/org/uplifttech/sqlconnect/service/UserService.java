package org.uplifttech.sqlconnect.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.uplifttech.sqlconnect.entity.User;
import org.uplifttech.sqlconnect.records.UserCreationRequest;
import org.uplifttech.sqlconnect.repository.UserRepository;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void createUser(UserCreationRequest userCreationRequest){
        log.info("Creating user " + userCreationRequest);
        User user = new User();
        user.setName(userCreationRequest.name());
        user.setEmail(userCreationRequest.email());
        userRepository.save(user);
    }

}
