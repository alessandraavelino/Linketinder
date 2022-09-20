package com.linketinder.aczg

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;
import groovy.test.GroovyTestCase
import com.linketinder.aczg.Candidato
class MainTeste  {
    static ArrayList Candidatos =[]
    void cadastroTeste(){

        Candidato c = new Candidato()
        c.nomeCandidato = "Nometeste"
        c.emailPessoal = "nometeste@mail.com"
        c.numCpf = "651651"
        c.idadeCandidato = "54"
        c.estadoSigla = "RJ"
        c.cepCidade = "24342"
        c.descricao = "em busca de emprego como dev"

        def test = mostrarCandidatos
        assertEquals(test, mostrarCandidatos)




    }
}
