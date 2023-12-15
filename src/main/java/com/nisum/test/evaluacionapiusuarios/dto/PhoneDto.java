package com.nisum.test.evaluacionapiusuarios.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhoneDto implements Serializable {
    private Long idPhone;
    private String number;
    private String cityCode;
    private String countryCode;

   // @JsonIgnore
   // public UserDto user;
}
