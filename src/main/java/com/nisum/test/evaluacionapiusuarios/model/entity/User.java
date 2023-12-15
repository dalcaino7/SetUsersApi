package com.nisum.test.evaluacionapiusuarios.model.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.nisum.test.evaluacionapiusuarios.dto.PhoneDto;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.LocalDateTime;
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
    private Long idUser;

    @Column(name="name")
    private String name;

    @NotBlank(message = "El correo no puede estar en blanco")
    @Email(message = "El formato del correo no es válido")
    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    @Column(name = "created", nullable = false, updatable = false)
    private LocalDateTime created;

    @Column(name = "modified")
    private LocalDateTime modified;

    @Column(name = "last_login")
    private LocalDateTime lastLogin;

    @Column(name="inactive")
    private String inactive;

    @Column(name="token")
    private String token;

    // @JsonIgnoreProperties(value={"user","hibernateLazyInitializer","handler"}, allowSetters=true)
    //@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "user", orphanRemoval = true)
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    //@ToString.Exclude
    private List<Phone> phones = new ArrayList<>();
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