package br.com.alura.bytebank.modelo

abstract class Conta(             //  Construtor primário - mais idiomatico ao padrão Kotlin
    var titular: Cliente,
    val numero: Int
) {
    var saldo: Double = 0.0
    protected set

//  O init executa alguma lógica no momento em que é chamado o construtor primário e ele é opcional
    init {
    println("Nova br.com.alura.bytebank.modelo.Conta: $numero titular: $titular")
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