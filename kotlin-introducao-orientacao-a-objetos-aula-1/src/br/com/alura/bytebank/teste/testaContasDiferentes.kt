import br.com.alura.bytebank.modelo.*

fun testaContasDiferentes() {
    val alex:Cliente = Cliente("Alex", "111.111.111-11", 12345)
    val maria:Cliente = Cliente("Maria", "444.444.444-44", 12345)
    val ricardo = Cliente(
        nome = "Ricardo",
        cpf = "333.333.333-33",
        senha = 12345,
        endereco = Endereco(
            logradouro = "Rua Vergueiro",
            numero = 457,
            bairro = "Paraiso",
            cep = "04118-05",
            cidade = "São Paulo",
            estado = "SP",
            complemento = "Proximo ao Centro Cultural"
        ))


    var corrente = ContaCorrente(titular = alex, numero = 1000)
    var poupanca = ContaPoupanca(titular = maria, numero = 1001)
    var salario = ContaSalario(titular = ricardo, numero = 1002)
    println()

    corrente.deposita(1000.0)
    poupanca.deposita(1000.0)
    salario.deposita(1000.0)

    println(ricardo.toString())
    println()

    println("Saldo conta corrente: ${corrente.saldo}")
    println("Saldo conta poupança: ${poupanca.saldo}")
    println("Saldo conta salario: ${salario.saldo}")
    println()

    corrente.saca(100.0)
    poupanca.saca(100.0)
    salario.saca(100.0)

    println("Saldo conta corrente após saque: ${corrente.saldo}")
    println("Saldo conta poupança após saque: ${poupanca.saldo}")
    println("Saldo conta salario após saque: ${salario.saldo}")
    println()

    corrente.transfere(poupanca, 100.0, 12345)

    println("Saldo conta corrente após fazer transferência: ${corrente.saldo}")
    println("Saldo conta poupança após receber transferência: ${poupanca.saldo}")
    println()

    poupanca.transfere(corrente, 100.0, 12345)

    println("Saldo conta poupança após fazer transferência: ${corrente.saldo}")
    println("Saldo conta corrente após receber transferência: ${poupanca.saldo}")
    println()

}