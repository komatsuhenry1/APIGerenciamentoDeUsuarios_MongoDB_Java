package com.example.Sprint4DB.usuario;

import com.example.Sprint4DB.usuario.exception.UsuarioNaoEncontradoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    public List<Usuario> searchUsuariosByNome(String nome) {
        return usuarioRepository.findByNomeContaining(nome);
    }

    public Usuario getUsuarioById(String id) {
        if (!usuarioRepository.existsById(id)){
            throw new UsuarioNaoEncontradoException("Usuário não encontrado com ID: " + id);
        }
        return usuarioRepository.findById(id).orElse(null);
    }

    public Usuario createUsuario(Usuario usuario){
        usuario.setDataCriacao(LocalDateTime.now());  // Define a data de criação
        usuario.setUltimoAcesso(LocalDateTime.now());  // Define o último acesso
        return usuarioRepository.save(usuario);
    }

    public Usuario updateUsuario(String id, Usuario usuarioAtualizado) {
        if (!usuarioRepository.existsById(id)){
            throw new UsuarioNaoEncontradoException("Usuário não encontrado com ID: " + id);
        }
        Usuario usuarioExistente = getUsuarioById(id);
        // Atualiza apenas os campos que não são nulos
        if (usuarioAtualizado.getNome() != null) {
            usuarioExistente.setNome(usuarioAtualizado.getNome());
        }
        if (usuarioAtualizado.getIdade() > 0) {
            usuarioExistente.setIdade(usuarioAtualizado.getIdade());
        }
        if (usuarioAtualizado.getCpf() != null) {
            usuarioExistente.setCpf(usuarioAtualizado.getCpf());
        }
        if (usuarioAtualizado.getEmail() != null) {
            usuarioExistente.setEmail(usuarioAtualizado.getEmail());
        }
        if (usuarioAtualizado.getTelefone() != null) {
            usuarioExistente.setTelefone(usuarioAtualizado.getTelefone());
        }
        if (usuarioAtualizado.getStatus() != null) {
            usuarioExistente.setStatus(usuarioAtualizado.getStatus());
        }
        if (usuarioAtualizado.getSaldo() > 0) {
            usuarioExistente.setSaldo(usuarioAtualizado.getSaldo());
        }
        return usuarioRepository.save(usuarioExistente);
    }

    public void deleteUsuario(String id) {
        if (!usuarioRepository.existsById(id)){
            throw new UsuarioNaoEncontradoException("Usuário não encontrado com ID: " + id);
        }
        usuarioRepository.deleteById(id);
    }
}