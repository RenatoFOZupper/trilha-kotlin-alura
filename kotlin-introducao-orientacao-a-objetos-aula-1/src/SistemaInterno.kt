class SistemaInterno {

    fun autoriza(superior: FuncionarioAdmin, senha: Int) {
        if (superior.autentica(senha)) {
            println("Bem vindo ao ByteBank")
        } else {
            println("Acesso negado")
        }
    }

}