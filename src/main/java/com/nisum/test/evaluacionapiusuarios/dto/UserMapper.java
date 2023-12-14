package com.nisum.test.evaluacionapiusuarios.dto;

import com.nisum.test.evaluacionapiusuarios.model.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    //@Mapping(target = "idUser", ignore = true)
    UserDto userToUserDTO(User user);

    User userDTOToUser(UserDto userDto);
}

