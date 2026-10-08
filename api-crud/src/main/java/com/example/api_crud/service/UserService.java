package com.example.api_crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.api_crud.dto.UserRequest;
import com.example.api_crud.model.User;
import com.example.api_crud.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository; 

    public List<User> listar() {
        return repository.findAll();
    }

    public User buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    public User criar(UserRequest req) {
        if (repository.existsByEmail(req.email())) {
            throw new RuntimeException("Email já cadastrado");
        }
        User u = new User();
        u.setNome(req.nome());
        u.setEmail(req.email());
        u.setDataNascimento(req.dataNascimento());
        return repository.save(u);
    }

    public User atualizar(Long id, UserRequest req) {
        User u = buscarPorId(id);
        u.setNome(req.nome());
        u.setEmail(req.email());
        u.setDataNascimento(req.dataNascimento());
        return repository.save(u);
    }

    public void deletar(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Usuário não encontrado");
        }
        repository.deleteById(id);
    }
}