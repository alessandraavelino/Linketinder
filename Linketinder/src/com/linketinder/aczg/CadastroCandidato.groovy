package com.linketinder.aczg

class CadastroCandidato {
    static def void cadastro(){
        Candidato c = new Candidato()

        printf ("Digitte seu nome: ")
        c.nomeCandidato = (System.in.newReader().readLine())
        printf ("E-mail: ")
        c.emailPessoal = (System.in.newReader().readLine())
        printf ("CPF: ")
        c.numCpf  = (System.in.newReader().readLine())
        printf ("Idade: ")
        c.idadeCandidato  = (System.in.newReader().readLine())
        printf ("Estado (SIGLA): ")
        c.estadoSigla  = (System.in.newReader().readLine())
        printf ("Cep de onde mora: ")
        c.cepCidade  = (System.in.newReader().readLine())
        printf ("Descrição de perfil: ")
        c.descricao  = (System.in.newReader().readLine())

    }
}
