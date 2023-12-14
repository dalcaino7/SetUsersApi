package com.nisum.test.evaluacionapiusuarios.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto implements Serializable {

        public Long idUser;
        public String name;
        public String email;
        public String password;

       // @JsonIgnore
        public List<PhoneDto> phones;
}
