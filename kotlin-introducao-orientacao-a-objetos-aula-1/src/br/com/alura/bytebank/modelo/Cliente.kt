package br.com.alura.bytebank.modelo

class Cliente(
    val nome: String,
    val cpf: String,
    private val senha: Int,
    var endereco: Endereco = Endereco()
) : Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

    override fun toString(): String {
        return "Cliente(nome='$nome', cpf='$cpf', endereco=$endereco)"
    }


}