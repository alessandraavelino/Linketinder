package com.linketinder.aczg

class Cadastros {
    static ArrayList Empresas =[]
    static ArrayList Candidatos =[]

    static def cadastrarCandidato(Candidato candidato){
        Candidatos.add(candidato)


    }

    static def void cadastrarEmpresa(Empresa empresa){
        Empresas.add(empresa)

    }

    static ArrayList getCandidatos(){
        return Candidatos
    }

    static ArrayList getEmpresa(){
        return Empresas
    }

    static def mostrarEmpresas(){
        for (empresa in Empresas){
            println empresa
        }
    }

    static def mostrarCandidatos(){
        for (candidato in Candidatos){
            println candidato
        }
    }
}