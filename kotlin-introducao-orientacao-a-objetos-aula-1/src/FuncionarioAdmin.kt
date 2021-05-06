abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    val senha:Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
)  {

    abstract override fun bonificacao(): Double

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}