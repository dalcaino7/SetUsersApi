package com.nisum.test.evaluacionapiusuarios.model.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "phones")
@Data
@NoArgsConstructor
public class Phone implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_phone", nullable = false, updatable = false)
    public Long idPhone;

    @Column(name="number")
    public String number;

    @Column(name="city_code")
    public String cityCode;

    @Column(name="country_code")
    public String countryCode;

    //@JsonIgnoreProperties(value={"phones","hibernateLazyInitializer","handler"}, allowSetters=true)
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "id_user")
    //@JoinColumn(name = "id_user", referencedColumnName = "id_user")
    //@ToString.Exclude
    //public User user;
/*
    @Override
    public String toString() {
        return "Phone{" +
                "idPhone=" + idPhone +
                ", number='" + number + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", countryCode='" + countryCode + '\'' +
                '}';
    }*/

}
