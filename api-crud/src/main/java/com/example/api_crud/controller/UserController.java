package com.example.api_crud.controller;

import com.example.api_crud.dto.UserRequest;
import com.example.api_crud.dto.UserResponse;
import com.example.api_crud.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping
    public List<UserResponse> listar() {
        return service.listar().stream().map(UserResponse::from).toList();
    }

    @GetMapping("/{id}")
    public UserResponse buscar(@PathVariable Long id) {
        return UserResponse.from(service.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<UserResponse> criar(@Valid @RequestBody UserRequest req) {
        var criado = service.criar(req);
        return ResponseEntity
            .created(URI.create("/api/user/" + criado.getId()))
            .body(UserResponse.from(criado));
    }

    @PutMapping("/{id}")
    public UserResponse atualizar(@PathVariable Long id,
                                     @Valid @RequestBody UserRequest req) {
        return UserResponse.from(service.atualizar(id, req));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}