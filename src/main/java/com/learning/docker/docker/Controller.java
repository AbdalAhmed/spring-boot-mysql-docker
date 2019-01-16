package com.learning.docker.docker;

import com.learning.docker.docker.entity.User;
import com.learning.docker.docker.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/getUsers")
    private Iterable<User> getUsers() {

        return userRepository.findAll();
    }
}
