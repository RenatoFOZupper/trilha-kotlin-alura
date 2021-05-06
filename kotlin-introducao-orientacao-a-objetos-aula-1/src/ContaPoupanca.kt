class ContaPoupanca(
    titular: String,
    numero: Int
) : Conta(
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

    override fun transfere(contaDestino: Conta, valor: Double): Boolean {
        return super.transfere(contaDestino, valor)
    }




}