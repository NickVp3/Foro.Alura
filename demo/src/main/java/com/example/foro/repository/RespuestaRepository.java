package com.example.foro.repository;

import com.example.foro.model.Respuesta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {
    List <Respuesta> findByTopicoId(Long topicoId);
}
