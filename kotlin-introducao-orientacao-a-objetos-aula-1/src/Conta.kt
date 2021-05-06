//  Construtor primário - mais idiomatico ao padrão Kotlin

abstract class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo: Double = 0.0
    protected set

//  O init executa alguma lógica no momento em que é chamado o construtor primário e ele é opcional
    init {
    println("Nova Conta: $numero titular: $titular")
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


    open fun transfere(contaDestino: Conta, valor: Double): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            contaDestino.deposita(valor)
            return true
        }
        return false
    }

//    fun getSaldo(): Double {
//        return saldo
//    }
//
//    fun setSaldo(valor: Double) {
//        saldo += valor
//    }
}