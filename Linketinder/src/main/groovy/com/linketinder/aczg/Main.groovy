package com.linketinder.aczg

Cadastros.cadastrarCandidato()
Cadastros.cadastrarEmpresa()
Cadastros.mostrarCandidatos()
Cadastros.mostrarEmpresas()

menu()

def menu() {
    printf "Escolha uma opção abaixo\n"
    printf "1 - Cadastrar-se como Empresa\n"
    printf "2 - Cadastrar-se como Candidato\n"
    printf"3 -  Exibir empresas\n"
    printf "4 - Exibir candidatos\n"
    printf "5 - Sair\n"
    printf "-> "

}
def opc = System.in.newReader().readLine() as Integer

if (opc == 1){
    CadastroEmpresa.cadastro()

} else if (opc == 2) {
    CadastroCandidato.cadastro()

} else if (opc == 3) {
    Cadastros.mostrarEmpresas()
} else if (opc == 4) {
    Cadastros.mostrarCandidatos()

} else if (opc == 5) {
    menu()

} else {
    printf ("Opção inválida !!")

}

