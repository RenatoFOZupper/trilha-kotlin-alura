package modelo

import modelo.Conta

abstract class ContaTransferivel(
    titular: String,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {

    fun transfere(contaDestino: Conta, valor: Double): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            contaDestino.deposita(valor)
            return true
        }
        return false
    }


}