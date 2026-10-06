package com.example.api_crud.repository;

import com.example.api_crud.model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<user, Long> {
    Optional<user> findByEmail(String email);

    boolean existsByEmail(String email);
}
