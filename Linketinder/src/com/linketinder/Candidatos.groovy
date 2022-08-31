package com.linketinder

class Candidato {
    String nomeCandidato
    String emailpessoal
    Integer numCpf
    Integer idadeCandidato
    String estadoSigla
    Integer cepCidade
    String descricao
    List listaCompetencias = []

    public Candidato(String nome, String email, Integer cpf, Integer idade, String estado, Integer cep, String descPessoal, List competencias) {
        nomeCandidato = nome
        emailpessoal = email
        numCpf = cpf

        idadeCandidato = idade
        estadoSigla = estado
        cepCidade = cep
        descricao = descPessoal
        listaCompetencias = competencias

    }
}
def candidato1 = new Candidato("Maria", "maria@gmail.com", 156465423, 34, "rn", 123456781, "programador web", ['Python', 'Java', 'Spring Framework', 'Angular'])
def candidato2 = new Candidato("Jose", "jose@gmail.com", 321654897, 19, "pb", 987894564, "programador mobile", ['React Native', 'Java', 'Kotlin', 'Flutter'])
def candidato3 = new Candidato("Fernando", "fernando@gmail.com", 15264564, 20, "go", 1552689, "programador full stack", ['Python', 'Java', 'Spring Framework', 'Angular', 'SQL'])
def candidato4 = new Candidato("João", "joao@gmail.com", 897879797, 28, "sp", 1247897, "programador backend", ['Python', 'Java', 'Spring Framework', 'SQL'])
def candidato5 = new Candidato("Igor", "igor@gmail.com", 564654564, 39, "rj", 1545878, "programador frontend", ['HTML', 'Javascript', 'Spring Framework', 'Angular'])
println candidato1
println candidato2
println candidato3
println candidato4
println candidato5
