package com.nisum.test.evaluacionapiusuarios.model.repository;


import com.nisum.test.evaluacionapiusuarios.dto.UserDto;
import com.nisum.test.evaluacionapiusuarios.model.entity.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    public abstract List<User> findAll();
    public abstract User save(User user);

    public abstract User findByEmail(String email);

}
