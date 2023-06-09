    package com.example.meusgastos.domain.model;

    public class ErrorResposta {
        private String dataHora;

        private String mensagem;

        private String titulo;

        private Integer status;

        public ErrorResposta(String dataHora, String mensagem, String titulo, Integer status) {
            this.dataHora = dataHora;
            this.mensagem = mensagem;
            this.titulo = titulo;
            this.status = status;
        }

        public String getDataHora() {
            return dataHora;
        }

        public void setDataHora(String dataHora) {
            this.dataHora = dataHora;
        }

        public String getMensagem() {
            return mensagem;
        }

        public void setMensagem(String mensagem) {
            this.mensagem = mensagem;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }
    }
