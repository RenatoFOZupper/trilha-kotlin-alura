package br.com.alura.bytebank.modelo

abstract class ContaTransferivel(
    titular: Cliente,
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