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
    public Long idPhone;
    public String number;
    public String cityCode;
    public String countryCode;

   // @JsonIgnore
   // public UserDto user;
}
