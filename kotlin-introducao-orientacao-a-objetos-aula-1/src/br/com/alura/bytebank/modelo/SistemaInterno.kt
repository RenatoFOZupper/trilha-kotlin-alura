package br.com.alura.bytebank.modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int, autenticado: () -> Unit = {}) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao ByteBank")
            autenticado()
        } else {
            println("Acesso negado")
        }
    }

    //Exemplo de uso do Receiver
    fun entraReceiver(admin: Autenticavel, senha: Int, autenticado: SistemaInterno.() -> Unit = {}) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao ByteBank")
            autenticado()
        } else {
            println("Acesso negado")
        }
    }

    fun pagamento() {
        println("realizando pagamento")
    }

}