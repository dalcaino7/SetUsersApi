package com.nisum.test.evaluacionapiusuarios.model.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.nisum.test.evaluacionapiusuarios.dto.PhoneDto;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@Table(name = "users")
@NoArgsConstructor
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_user", nullable = false, updatable = false)
    public Long idUser;

    @Column(name="name")
    public String name;

    @Column(name="email")
    public String email;

    @Column(name="password")
    public String password;

   // @JsonIgnoreProperties(value={"user","hibernateLazyInitializer","handler"}, allowSetters=true)
    //@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "user", orphanRemoval = true)
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    //@ToString.Exclude
    public List<Phone> phones = new ArrayList<>();
/*

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
*/

}