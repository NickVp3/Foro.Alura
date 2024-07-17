package com.example.foro.model;

public class Reaccion {
    package com.example.foro.model;

import javax.persistence.*;

    @Entity
    public class Reaccion {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String tipo; // por ejemplo: 'like', 'dislike'

        @ManyToOne
        private Usuario usuario;

        @ManyToOne
        private Topico topico;

        // Getters y setters
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public Usuario getUsuario() {
            return usuario;
        }

        public void setUsuario(Usuario usuario) {
            this.usuario = usuario;
        }

        public Topico getTopico() {
            return topico;
        }

        public void setTopico(Topico topico) {
            this.topico = topico;
        }
    }

}
