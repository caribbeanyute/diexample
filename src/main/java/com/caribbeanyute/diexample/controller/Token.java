package com.caribbeanyute.diexample.controller;

import com.caribbeanyute.diexample.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AliasFor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;


@RestController
public class Token {


    TokenService tokenService;

    @Autowired
    public void setTokenService(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @RequestMapping(value = "/ex/{token}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity setToken(@PathVariable String token) {

        tokenService.setToken(token);
        System.out.println(tokenService.getToken());
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/get/")
    public Map<String, String> getToken(){
        HashMap<String, String> map = new HashMap<>();
        map.put("token", tokenService.getToken());
        map.put("lastTokenTime", tokenService.getLastTokenTime());
       return map;
    }
}
