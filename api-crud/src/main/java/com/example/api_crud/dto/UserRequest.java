package com.example.api_crud.dto;

import java.time.LocalDate;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

public record UserRequest(
        @NotBlank(message = "Nome é obrigatório") String nome,
        @NotBlank @Email(message = "Email inválido") String email,
        @NotNull(message = "Adicione a data de nascimento obrigatória") 
        @Past(message = "Data de nascimento deve ser no passado") LocalDate dataNascimento) {
}