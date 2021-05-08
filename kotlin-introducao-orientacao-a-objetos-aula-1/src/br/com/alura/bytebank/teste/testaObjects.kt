package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.*

fun testaObjects() {
    // <----------------------------------Object Expression--------------------------------------------------->

    // Object Expression -> é um objeto anonimo que fica no escopo da função
    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1000

        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistemaInterno: SistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, fran.senha)

    // <------------------------------------------------------------------------------------->

    val alex: Cliente = Cliente(nome = "Alex", senha = 12345, cpf = "111.111.111-11", endereco = Endereco())
    val contaPoupanca = ContaPoupanca(titular = alex, numero = 1000)
    val contaCorrente = ContaCorrente(titular = alex, numero = 1001)

    println("Total de contas ${Conta.total}")
    println(fran.nome)
}