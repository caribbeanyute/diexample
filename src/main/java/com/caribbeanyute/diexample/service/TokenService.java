package com.caribbeanyute.diexample.service;

public interface TokenService {
    public abstract String getToken();
    public abstract void setToken(String token);
    public abstract String getLastTokenTime();
}
