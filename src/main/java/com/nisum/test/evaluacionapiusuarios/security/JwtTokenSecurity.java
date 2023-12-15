package com.nisum.test.evaluacionapiusuarios.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
//import org.springframework.security.core.userdetails.UserDetails;

import java.util.Date;

public class JwtTokenSecurity {
/*
    private static final String SECRET_KEY = "qwer@1234";

    public static String generateToken(User user) {
        return Jwts.builder()
                .setSubject(user.get.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10)) // 10 horas
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();
    }
/*
    public static boolean validateToken(String token, UserDetails userDetails) {
        try {
            Claims claims = Jwts.parserBuilder()
                    .setSigningKey(SECRET_KEY.getBytes())
                    .build()
                    .parseClaimsJws(token)
                    .getBody();

            // Verificar que el usuario del token coincida con el usuario proporcionado por UserDetails
            if (claims.getSubject().equals(userDetails.getUsername())) {
                // Verificar la fecha de expiración del token
                Date expirationDate = claims.getExpiration();
                return !expirationDate.before(new Date()); // Token aún no ha expirado
            }
            return false;
        } catch (Exception e) {
            // Excepción al validar el token
            return false;
        }
    }*/
}

