package com.example.Sprint4DB.usuario;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UsuarioWebController {

    @GetMapping("/usuarios")
    public String mostrarUsuarios(Model model) {
        model.addAttribute("usuarios", List.of());
        return "usuarios";
    }
}

