package com.example.foro.repository;

public class ReaccionRepository {
    package com.example.foro.repository;

    import com.example.foro.model.Reaccion;
    import org.springframework.data.jpa.repository.JpaRepository;

    public interface ReaccionRepository extends JpaRepository<Reaccion, Long> {
    }

}
