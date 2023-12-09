package com.security.jwt.dto;

public record AuthRequest (
        String username,
        String password
){
}