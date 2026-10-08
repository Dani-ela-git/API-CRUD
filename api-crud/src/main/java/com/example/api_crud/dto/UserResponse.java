package com.example.api_crud.dto;

import java.time.LocalDate;

import com.example.api_crud.model.User;

public record UserResponse(Long id, String nome, String email, LocalDate dataNascimento) {
    public static UserResponse from(User u) {
        return new UserResponse(u.getId(), u.getNome(), u.getEmail(), u.getDataNascimento());
    }
}
