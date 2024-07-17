package com.example.foro.repository;

public class RespuestaOpinionRepository {
    package com.example.foro.repository;

    import com.example.foro.model.RespuestaOpinion;
    import org.springframework.data.jpa.repository.JpaRepository;

    import java.util.List;

    public interface RespuestaOpinionRepository extends JpaRepository<RespuestaOpinion, Long> {
        List<RespuestaOpinion> findByRespuestaId(Long respuestaId);
    }

}
