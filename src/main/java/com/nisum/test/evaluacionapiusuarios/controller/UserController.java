package com.nisum.test.evaluacionapiusuarios.controller;

import com.nisum.test.evaluacionapiusuarios.dto.UserDto;
import com.nisum.test.evaluacionapiusuarios.dto.UserResponseDto;
import com.nisum.test.evaluacionapiusuarios.model.repository.UserRepository;
import com.nisum.test.evaluacionapiusuarios.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    UserResponseDto userResponseDto = new UserResponseDto();


    @GetMapping(value = "/user", produces = "application/json")
    public List<UserDto> findAllUsers() throws Exception {
        return userService.findAll();
    }

    @PostMapping("/user")
    public ResponseEntity<?> addUser(@RequestBody UserDto userDto) throws Exception {

        userResponseDto = userService.saveUser(userDto);

        return ResponseEntity.status(HttpStatus.CREATED).body(userResponseDto);

        // return userRepository.save(usuario);
    }
}

