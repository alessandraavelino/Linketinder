package com.linketinder.aczg

class Empresa {
    String nomeEmpresa
    String emailcorp
    Integer numCnpj
    String nomePais
    String estadoSigla
    Integer cepCidade
    String descricaoVaga
    List listaCompetencias = []

    public Empresa(String nome, String email, Integer cnpj, String pais, String estado, Integer cep, String descricao, List competencias) {
        nomeEmpresa = nome
        emailcorp = email
        numCnpj = cnpj
        nomePais = pais
        estadoSigla = estado
        cepCidade = cep
        descricaoVaga = descricao
        listaCompetencias = competencias

    }


    @Override
    public String toString() {
        return "Empresa{" +
                "nomeEmpresa='" + nomeEmpresa + '\'' +
                ", emailcorp='" + emailcorp + '\'' +
                ", numCnpj=" + numCnpj +
                ", nomePais='" + nomePais + '\'' +
                ", estadoSigla='" + estadoSigla + '\'' +
                ", cepCidade=" + cepCidade +
                ", descricaoVaga='" + descricaoVaga + '\'' +
                ", listaCompetencias=" + listaCompetencias +
                '}';
    }
}