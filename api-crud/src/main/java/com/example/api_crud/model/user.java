package com.example.api_crud.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "usuários")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;
}
