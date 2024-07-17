package com.example.foro.service;

public class RespuestaOpinionService {
    package com.example.foro.service;

import com.example.foro.model.RespuestaOpinion;
import com.example.foro.repository.RespuestaOpinionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class RespuestaOpinionService {
        @Autowired
        private RespuestaOpinionRepository respuestaOpinionRepository;

        public List<RespuestaOpinion> findByRespuestaId(Long respuestaId) {
            return respuestaOpinionRepository.findByRespuestaId(respuestaId);
        }

        public RespuestaOpinion save(RespuestaOpinion respuestaOpinion) {
            return respuestaOpinionRepository.save(respuestaOpinion);
        }
    }

}
