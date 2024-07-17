package com.example.foro.controller;

public class RespuestaOpinionController {
    package com.example.foro.controller;

import com.example.foro.model.RespuestaOpinion;
import com.example.foro.service.RespuestaOpinionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/api/respuesta-opiniones")
    public class RespuestaOpinionController {
        @Autowired
        private RespuestaOpinionService respuestaOpinionService;

        @GetMapping("/respuesta/{respuestaId}")
        public List<RespuestaOpinion> getRespuestasOpinionesByRespuesta(@PathVariable Long respuestaId) {
            return respuestaOpinionService.findByRespuestaId(respuestaId);
        }

        @PostMapping
        public RespuestaOpinion createRespuestaOpinion(@RequestBody RespuestaOpinion respuestaOpinion) {
            return respuestaOpinionService.save(respuestaOpinion);
        }
    }

}
