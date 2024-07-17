package com.example.foro.controller;

import com.example.foro.model.Respuesta;
import com.example.foro.service.RespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/respuestas")
public class RespuestaController {
    @Autowired
    private RespuestaService respuestaService;

    @GetMapping("/topico/{topicoId}")
    public List<Respuesta> getRespuestasByTopico(@PathVariable Long topicoId) {
        return respuestaService.findByTopicoId(topicoId);
    }

    @PostMapping
    public Respuesta createRespuesta(@RequestBody Respuesta respuesta) {
        return respuestaService.save(respuesta);
    }
}
