package com.linketinder.aczg

class CadastroEmpresa {
    static def void cadastro(){
        Empresa e = new Empresa()

        printf ("Informe o nome da empresa: ")
        e.nomeEmpresa(System.in.newReader().readLine())
        printf ("E-mail corporativo: ")
        e.emailcorp(System.in.newReader().readLine())
        printf ("CNPJ: ")
        e.numCnpj(System.in.newReader().readLine())
        printf ("Nome do país: ")
        e.nomePais(System.in.newReader().readLine())
        printf ("Estado (SIGLA):")
        e.estadoSigla(System.in.newReader().readLine())
        printf ("Cep da cidade: ")
        e.cepCidade(System.in.newReader().readLine())
        printf ("Descreva a sua vaga: ")
        e.descricaoVaga(System.in.newReader().readLine())

    }
}