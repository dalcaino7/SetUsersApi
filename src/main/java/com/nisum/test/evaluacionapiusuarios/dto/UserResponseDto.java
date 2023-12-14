package com.nisum.test.evaluacionapiusuarios.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDto implements Serializable {

    public String id;
    public String created;
    public String modified;
    public String last_login;
    public String token;

}
