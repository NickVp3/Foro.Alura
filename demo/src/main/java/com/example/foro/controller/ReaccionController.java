package com.example.foro.controller;

public class ReaccionController {
    package com.example.foro.controller;

import com.example.foro.model.Reaccion;
import com.example.foro.service.ReaccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/api/reacciones")
    public class ReaccionController {
        @Autowired
        private ReaccionService reaccionService;

        @GetMapping
        public List<Reaccion> getAllReacciones() {
            return reaccionService.findAll();
        }

        @PostMapping
        public Reaccion createReaccion(@RequestBody Reaccion reaccion) {
            return reaccionService.save(reaccion);
        }
    }

}
