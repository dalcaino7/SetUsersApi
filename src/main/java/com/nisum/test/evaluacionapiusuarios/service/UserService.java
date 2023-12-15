package com.nisum.test.evaluacionapiusuarios.service;

import com.nisum.test.evaluacionapiusuarios.dto.*;
import com.nisum.test.evaluacionapiusuarios.model.entity.User;
import com.nisum.test.evaluacionapiusuarios.model.repository.UserRepository;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService implements IUserService{

    @Value("${jwt.secret-key}")
    private String secretKey;

    @Autowired
    private UserRepository userRepository;

    private LocalDateTime now = LocalDateTime.now();

    @Override
    @Transactional()
    public UserResponseDto saveUser(UserDto userDto) throws Exception {
        UserResponseDto userResponseDto = new UserResponseDto();
        try{
          //  User user = userRepository.findByEmail(userDto.getEmail());

            if(userDto.getCreated()==null){
                userDto.setCreated(now);
                userDto.setModified(now);
                userDto.setInactive("Inactivo");

            }else{
                userDto.setModified(now);
            }

            User user = UserMapper.INSTANCE.userDTOToUser(userDto);

            user = userRepository.save(user);

            userResponseDto.setId(user.getIdUser().toString());
            userResponseDto.setCreated(user.getCreated().toString());


            return userResponseDto;
        }catch(Exception e){
            e.printStackTrace();
        }
        return userResponseDto;
    }

    @Override
    @Transactional(readOnly = true)
    public List<UserDto> findAll() throws Exception {
        List<User> users = userRepository.findAll();
        return users.stream().map(
                user -> UserMapper.INSTANCE.userToUserDTO(user)).collect(Collectors.toList());
    }

    @Override
    public UserDto login(LoginDto loginDto) throws Exception {

        UserDto userDto = new UserDto();

        try{

            User user = userRepository.findByEmail(loginDto.getEmail());

            if(user!=null){

                userDto.setLastLogin(now);
                userDto.setInactive("Activo");
                userDto.setToken(generateToken(user));


                return userDto;
            }


        }catch(Exception e){
            e.printStackTrace();
        }

        return userDto;//UserMapper.INSTANCE.userToUserDTO(user);
    }


    public String generateToken(User user) {
        String token = "";
        try {
             token = Jwts.builder()
                    .setSubject(user.getEmail())
                    .setIssuedAt(new Date())
                    .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10)) // 10 horas
                    .signWith(SignatureAlgorithm.HS256, secretKey)
                    .compact();

            return token;
        }catch(Exception e){
            e.printStackTrace();
        }
        return token;

    }

}