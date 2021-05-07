package br.com.alura.bytebank.modelo

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