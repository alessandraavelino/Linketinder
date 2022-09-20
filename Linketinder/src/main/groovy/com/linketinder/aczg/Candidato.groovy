package com.linketinder.aczg

class Candidato {
    String nomeCandidato
    String emailPessoal
    String numCpf
    Integer idadeCandidato
    String estadoSigla
    String cepCidade
    String descricao
    List listaCompetencias = []

    public Candidato(String nome, String email, Integer cpf, Integer idade, String estado, Integer cep, String descPessoal, List competencias) {
        nomeCandidato = nome
        emailPessoal = email
        numCpf = cpf
        idadeCandidato = idade
        estadoSigla = estado
        cepCidade = cep
        descricao = descPessoal
        listaCompetencias = competencias

    }


    @Override
    public String toString() {
        return "Candidato{" +
                "nomeCandidato='" + nomeCandidato + '\'' +
                ", emailPessoal='" + emailPessoal + '\'' +
                ", numCpf='" + numCpf + '\'' +
                ", idadeCandidato=" + idadeCandidato +
                ", estadoSigla='" + estadoSigla + '\'' +
                ", cepCidade='" + cepCidade + '\'' +
                ", descricao='" + descricao + '\'' +
                ", listaCompetencias=" + listaCompetencias +
                '}';
    }
}
