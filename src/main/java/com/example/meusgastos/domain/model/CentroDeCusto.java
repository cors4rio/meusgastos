    package com.example.meusgastos.domain.model;

    import com.fasterxml.jackson.annotation.JsonBackReference;
    import jakarta.persistence.*;

    import java.util.List;

    @Entity
    @Table(name = "centrodecusto")
    public class CentroDeCusto {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "idCentroDeCusto")
        private Long id;

        @Column(nullable = false)
        private String descricao;

        @Column(columnDefinition = "TEXT")
        private String observacao;

        @ManyToOne
        @JoinColumn(name = "idUsuario")
        private Ususario usuario;

        @ManyToMany(mappedBy = "centrosDeCusto")
        @JsonBackReference
        private List<Titulo> titulos;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public String getObservacao() {
            return observacao;
        }

        public void setObservacao(String observacao) {
            this.observacao = observacao;
        }

        public Ususario getUsuario() {
            return usuario;
        }

        public void setUsuario(Ususario usuario) {
            this.usuario = usuario;
        }

        public List<Titulo> getTitulos() {
            return titulos;
        }

        public void setTitulos(List<Titulo> titulos) {
            this.titulos = titulos;
        }
    }
