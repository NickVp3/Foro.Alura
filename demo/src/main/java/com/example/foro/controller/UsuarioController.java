package com.example.foro.controller;

import com.example.foro.model.Usuario;
import com.example.foro.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/register")
    public Usuario register(@RequestBody Usuario usuario) {
        return usuarioService.save(usuario);
    }

    // Otros endpoints según sea necesario
}

