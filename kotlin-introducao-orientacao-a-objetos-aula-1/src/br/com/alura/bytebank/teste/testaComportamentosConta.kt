import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.*

fun testaCompartamentosConta() {
    val alex: Cliente = Cliente("ALex", "111.111.111-11", 12345)

    val contaAlex = ContaCorrente(alex, 1000)
    contaAlex.deposita(200.0)

    println("Titular da conta: ${contaAlex.titular.nome}")
    println("Numero da conta:  ${contaAlex.numero}")
    println("Saldo da conta: ${contaAlex.saldo}")
    println()


    val fran: Cliente = Cliente("Fran", "222.222.222-22", 12345)

    // na chamada deste construtor fazemos uso do 'label', que é indicar o campo que está recebendo aquele valor
    // a vantagem dessa abordagem permite a atribuição do campos em qualquer ordem dentro do construtor
    val contaFran = ContaPoupanca(numero = 1001, titular = fran)
    contaFran.deposita(300.0)

    println("Titular da conta: ${contaFran.titular.nome}")
    println("Numero da conta:  ${contaFran.numero}")
    println("Saldo da conta: ${contaFran.saldo}")
    println()

    println("Depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)
    println()

    println("Depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)
    println()

    println("Saldo da conta: ${contaAlex.saldo}")
    println("Saldo da conta: ${contaFran.saldo}")
    println()

    println("Sacando na conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)
    println()

    println("Sacando na conta do Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)
    println()

    println("Saldo da conta: ${contaAlex.saldo}")
    println("Saldo da conta: ${contaFran.saldo}")
    println()

    println("Saque em excesso na conta do Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)
    println()

    println("Saque em excesso na conta do Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)
    println()

    println("Saldo da conta: ${contaAlex.saldo}")
    println("Saldo da conta: ${contaFran.saldo}")
    println()

    println("Transferência da conta da Fran para o Alex")
    try {
        contaFran.transfere(contaDestino = contaAlex, valor = 100.0, senha = 12345)
        println("Transferência sucedida")
    } catch (e: SaldoInsuficienteException) {
        println("Falha na transferência")
        e.printStackTrace()
    }

    println("Saldo da conta do Alex: ${contaAlex.saldo}")
    println("Sado da conta da Fran: ${contaFran.saldo}")

    println("Transferência da conta do Alex para Fran")
    try {
        contaAlex.transfere(contaDestino = contaFran, valor = 249.0, senha = 1234)
        println("Transferência sucedida")
    } catch (e: SaldoInsuficienteException) {
        println("Falha na transferência")
        println("Saldo insuficiente")
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException) {
        println("Falha na transferência")
        println("Falha na autenticação")
        e.printStackTrace()
    } catch (e: Exception) {
        println("Erro desconhecido")
        e.printStackTrace()
}

    println("Saldo da conta do Alex: ${contaAlex.saldo}")
    println("Sado da conta da Fran: ${contaFran.saldo}")
}

