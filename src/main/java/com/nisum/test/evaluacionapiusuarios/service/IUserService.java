package com.nisum.test.evaluacionapiusuarios.service;

import com.nisum.test.evaluacionapiusuarios.dto.LoginDto;
import com.nisum.test.evaluacionapiusuarios.dto.UserDto;
import com.nisum.test.evaluacionapiusuarios.dto.UserResponseDto;
import com.nisum.test.evaluacionapiusuarios.model.entity.User;

import java.util.List;

public interface IUserService {
    UserResponseDto saveUser(UserDto userDto) throws Exception;

    List<UserDto> findAll() throws Exception;

    UserDto login(LoginDto loginDto) throws Exception;

}
