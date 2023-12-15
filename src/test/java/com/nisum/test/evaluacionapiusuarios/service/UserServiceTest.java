package com.nisum.test.evaluacionapiusuarios.service;

import com.nisum.test.evaluacionapiusuarios.dto.LoginDto;
import com.nisum.test.evaluacionapiusuarios.dto.UserDto;
import com.nisum.test.evaluacionapiusuarios.dto.UserResponseDto;
import com.nisum.test.evaluacionapiusuarios.model.entity.User;
import com.nisum.test.evaluacionapiusuarios.model.repository.UserRepository;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.lang.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@SpringBootTest
class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Mock
    private JwtBuilder jwtBuilder;


    @Test
    void TestSaveUser() throws Exception {
        when(userRepository.save(any())).thenReturn(new User());
        UserDto userDto = new UserDto();
        userDto.setEmail("test@example.com");
        UserResponseDto userResponseDto = userService.saveUser(userDto);
        assertNotNull(userResponseDto);
        Assertions.assertNotNull("s");
    }

    @Test
    public void TestFindAll() throws Exception {
        when(userRepository.findAll()).thenReturn(Arrays.asList(new User(), new User()));
        List<UserDto> userDtos = userService.findAll();
        assertNotNull(userDtos);
        assertEquals(2, userDtos.size());
    }

    @Test
    public void testLogin() throws Exception {
        when(userRepository.findByEmail(anyString())).thenReturn(new User());
        LoginDto loginDto = new LoginDto();
        loginDto.setEmail("test@example.com");
        UserDto userDto = userService.login(loginDto);
        assertNotNull(userDto);
    }


}