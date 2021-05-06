package modelo

class ContaPoupanca(
    titular: String,
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