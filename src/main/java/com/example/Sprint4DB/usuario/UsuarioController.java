package com.example.Sprint4DB.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    // Endpoint para buscar todos os usuários
    @GetMapping
    public List<Usuario> getAllUsuarios() {
        return usuarioService.getAllUsuarios();
    }

    // Endpoint para buscar usuários por nome
    @GetMapping("/search")
    public List<Usuario> searchUsuariosByNome(@RequestParam String nome) {
        return usuarioService.searchUsuariosByNome(nome);
    }

    // Endpoint para buscar usuário por ID
    @GetMapping("/{id}")
    public Usuario getUsuarioById(@PathVariable String id) {
        return usuarioService.getUsuarioById(id);
    }

    // Endpoint para criar um usuário
    @PostMapping
    public ResponseEntity<Usuario> createUsuario(@RequestBody Usuario usuario) {
        Usuario novoUsuario = usuarioService.createUsuario(usuario);
        return new ResponseEntity<>(novoUsuario, HttpStatus.CREATED);
    }

    // Endpoint para atualizar um usuário
    @PutMapping("/{id}")
    public ResponseEntity<Usuario> updateUsuario(@PathVariable String id, @RequestBody Usuario usuario) {
        Usuario usuarioAtualizado = usuarioService.updateUsuario(id, usuario);
        if (usuarioAtualizado != null) {
            return new ResponseEntity<>(usuarioAtualizado, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Endpoint para excluir um usuário
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id){
        usuarioService.deleteUsuario(id);
        return ResponseEntity.ok("Client com o ID: " + id + " deletado com sucesso!");
    }
}