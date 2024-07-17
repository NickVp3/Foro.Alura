package com.example.foro.controller;

import com.example.foro.model.Topico;
import com.example.foro.service.TopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/topicos")
public class TopicoController {
    @Autowired
    private TopicoService topicoService;

    @GetMapping
    public List<Topico> getAllTopicos() {
        return topicoService.findAll();
    }

    @PostMapping
    public Topico createTopico(@RequestBody Topico topico) {
        return topicoService.save(topico);
    }

    @DeleteMapping("/{id}")
    public void deleteTopico(@PathVariable Long id) {
        topicoService.deleteById(id);
    }
}
