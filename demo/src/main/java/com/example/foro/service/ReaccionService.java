package com.example.foro.service;

public class ReaccionService {
    package com.example.foro.service;

import com.example.foro.model.Reaccion;
import com.example.foro.repository.ReaccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class ReaccionService {
        @Autowired
        private ReaccionRepository reaccionRepository;

        public List<Reaccion> findAll() {
            return reaccionRepository.findAll();
        }

        public Reaccion save(Reaccion reaccion) {
            return reaccionRepository.save(reaccion);
        }
    }

}
