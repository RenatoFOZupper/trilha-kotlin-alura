class ContaCorrente(
    titular: String,
    numero: Int
) : Conta(
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

    override fun transfere(contaDestino: Conta, valor: Double): Boolean {
        return super.transfere(contaDestino, valor)
    }

}