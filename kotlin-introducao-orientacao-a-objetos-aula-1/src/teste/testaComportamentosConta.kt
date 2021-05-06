import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaCompartamentosConta() {
    val contaAlex = ContaCorrente("Alex", 1000)
    contaAlex.deposita(200.0)

    println("Titular da conta: ${contaAlex.titular}")
    println("Numero da conta:  ${contaAlex.numero}")
    println("Saldo da conta: ${contaAlex.saldo}")
    println()


    // na chamada deste construtor fazemos uso do 'label', que é indicar o campo que está recebendo aquele valor
    // a vantagem dessa abordagem permite a atribuição do campos em qualquer ordem dentro do construtor
    val contaFran = ContaPoupanca(numero = 1001, titular = "Fran")
    contaFran.deposita(300.0)

    println("Titular da conta: ${contaFran.titular}")
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
    if (contaFran.transfere(contaDestino = contaAlex, valor = 100.0)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println("Saldo da conta do Alex: ${contaAlex.saldo}")
    println("Sado da conta da Fran: ${contaFran.saldo}")
}