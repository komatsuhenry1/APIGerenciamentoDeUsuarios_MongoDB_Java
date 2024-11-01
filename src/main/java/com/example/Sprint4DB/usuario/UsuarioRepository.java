package com.example.Sprint4DB.usuario;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    List<Usuario> findByNomeContaining(String nome);
}
