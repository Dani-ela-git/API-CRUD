package com.example.api_crud.dto;

import com.example.api_crud.model.user;

public record UserResponse(Long id, String nome, String email) {
    public static UserResponse from(user u) {
        return new UserResponse(u.getId(), u.getNome(), u.getEmail());
    }
}
