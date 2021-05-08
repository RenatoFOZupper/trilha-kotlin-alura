package br.com.alura.bytebank.modelo

//  Construtor primário - mais idiomatico ao padrão Kotlin
abstract class Conta(
    var titular: Cliente,
    val numero: Int
) {
    var saldo: Double = 0.0
        protected set

    // <----- Companion Object Declaration------>
/*    Utilizando apenas o Object Declaration, as subclasses poderiam modificar o seu valor mesmo com private
    setado e para resolver esse problema utilizamos o Companion Object, dessa forma somente a classe pode
    manipula-lo. Ele funciona de forma similar a um membro estático da lingguagel Java    */

        companion object Contador {
            var total = 0
                private set
        }


    // <------------------------------>

    //  O init executa alguma lógica no momento em que é chamado o construtor primário e ele é opcional
    init {
        println("Criando conta")
        total++

    }

    /*   Constutor secundário = geralmente usado para alguma logica especifica
       constructor(titular: String, numero: Int) {
           this.titular = titular
           this.numero = numero
       }
   */


/*       Modelo não convecional de getters & setters
        set(valor) {
            if (valor > 0) {
                field = valor
            }
        }
        get() { return field }
*/

    //Modelo ideomatico ao Kotlin
    open fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)




//    fun getSaldo(): Double {
//        return saldo
//    }
//
//    fun setSaldo(valor: Double) {
//        saldo += valor
//    }
}
/*
  <--------------------------  Conta Corrente ------------------------------>
*/

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : ContaTransferivel(
    titular = titular,
    numero = numero
) {

    override fun saca(valor: Double) {
        val valorComTaxa: Double = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }

    override fun deposita(valor: Double) {
        super.deposita(valor)
    }

}

/*
  <--------------------------  Conta Poupanca ------------------------------>
*/

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : ContaTransferivel(
    titular = titular,
    numero = numero
) {

    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    override fun deposita(valor: Double) {
        super.deposita(valor)
    }

}

/*
  <--------------------------  Conta Salario ------------------------------>
*/

class ContaSalario(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero) {

    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

}