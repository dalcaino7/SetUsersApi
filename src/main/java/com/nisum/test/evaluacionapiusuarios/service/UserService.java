package com.nisum.test.evaluacionapiusuarios.service;

import com.nisum.test.evaluacionapiusuarios.dto.UserDto;
import com.nisum.test.evaluacionapiusuarios.dto.UserMapper;
import com.nisum.test.evaluacionapiusuarios.dto.UserResponseDto;
import com.nisum.test.evaluacionapiusuarios.model.entity.User;
import com.nisum.test.evaluacionapiusuarios.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService implements IUserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional()
    public UserResponseDto saveUser(UserDto userDto) throws Exception {
        UserResponseDto userResponseDto = new UserResponseDto();
        // Lógica para validar correo y contraseña, generar token, etc.

        User user = UserMapper.INSTANCE.userDTOToUser(userDto);

        userResponseDto.setId("id1");
        userResponseDto.setToken("A");
        userResponseDto.setCreated("B");
        userResponseDto.setModified("C");
        userResponseDto.setLast_login("D");

        user = userRepository.save(user);

        return userResponseDto;
    }

    @Override
    @Transactional(readOnly = true)
    public List<UserDto> findAll() throws Exception {
        List<User> users = userRepository.findAll();
        return users.stream().map(
                user -> UserMapper.INSTANCE.userToUserDTO(user)).collect(Collectors.toList());
    }


}