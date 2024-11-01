package com.example.Sprint4DB.usuario;

import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Data
@Document(collection = "usuarios")
public class Usuario {

    @Id
    private String id;
    private String nome;
    private int idade;
    private String cpf;
    private String email;
    private String telefone;
    private String status;
    private LocalDateTime dataCriacao;
    private LocalDateTime ultimoAcesso;
    private double saldo;
}

