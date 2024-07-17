package com.example.foro.model;

public class RespuestaOpinion {
    package com.example.foro.model;

import javax.persistence.*;

    @Entity
    public class RespuestaOpinion {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String contenido;

        @ManyToOne
        private Usuario usuario;

        @ManyToOne
        private Respuesta respuesta;

        // Getters y setters
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getContenido() {
            return contenido;
        }

        public void setContenido(String contenido) {
            this.contenido = contenido;
        }

        public Usuario getUsuario() {
            return usuario;
        }

        public void setUsuario(Usuario usuario) {
            this.usuario = usuario;
        }

        public Respuesta getRespuesta() {
            return respuesta;
        }

        public void setRespuesta(Respuesta respuesta) {
            this.respuesta = respuesta;
        }
    }

}
