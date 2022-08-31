package com.linketinder



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
}

def empresa1 = new Empresa("LS Systems", "lsys@corp.mail.com", 4765657, "Brasil", "PB", 546464, "Em busca de programadores frontend", ["JavaScript", "ReactJS", "NodeJS", "MongoDB"])
def empresa2 = new Empresa("TX Solucoes", "txsol@corp.mail.com", 546546, "Brasil", "RJ", 8976876, "Em busca de analista de segurança", ["Python", "C", "Kali Linux", "Redes"])
def empresa3 = new Empresa("Tech Services", "techserv@corp.mail.com", 989879, "Brasil", "RS", 21232213, "Em busca de programadores web", ["JavaScript", "ReactJS", "Java", "MongoDB"])
def empresa4 = new Empresa("Soft Cloud", "softcl@corp.mail.com", 3454354, "Brasil", "RO", 34234234, "Em busca de programadores full stack", ["JavaScript", "ReactJS", "NodeJS", "MongoDB", "Python", "Java", "SQL"])
def empresa5 = new Empresa("Desenvolvapp ", "desvapp@corp.mail.com", 14564, "Brasil", "MG", 345345, "Em busca de programadores backend", ["Java", "Angular", "SQL", "Spring Boot"])
println empresa1
println empresa2
println empresa3
println empresa4
println empresa5