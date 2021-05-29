package com.caribbeanyute.diexample.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class TokenServiceImpl implements TokenService{
    private static String currentToken;
    private static LocalDateTime lastTokenTime;



    @Override
    public String getToken() {
        return currentToken;
    }

    @Override
    public void setToken(String token) {
        currentToken = token;
        this.lastTokenTime = LocalDateTime.now();
    }

    public String getLastTokenTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        return dtf.format(this.lastTokenTime);
    }
}
