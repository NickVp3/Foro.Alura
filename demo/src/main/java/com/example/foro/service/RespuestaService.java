
package com.example.foro.service;

import com.example.foro.model.Respuesta;
import com.example.foro.repository.RespuestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RespuestaService {
    @Autowired
    private RespuestaRepository respuestaRepository;

    public List<Respuesta> findByTopicoId(Long topicoId) {
        return respuestaRepository.findByTopicoId(topicoId);
    }

    public Respuesta save(Respuesta respuesta) {
        return respuestaRepository.save(respuesta);
    }
}
