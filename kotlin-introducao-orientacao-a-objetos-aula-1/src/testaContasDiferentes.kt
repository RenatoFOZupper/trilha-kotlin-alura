fun testaContasDiferentes() {
    var corrente = ContaCorrente(titular = "Alex", numero = 1000)
    var poupanca = ContaPoupanca(titular = "Maria", numero = 1001)

    corrente.deposita(1000.0)
    poupanca.deposita(1000.0)

    println("Saldo conta corrente: ${corrente.saldo}")
    println("Saldo conta poupança: ${poupanca.saldo}")

    corrente.saca(100.0)
    poupanca.saca(100.0)

    println("Saldo conta corrente após saque: ${corrente.saldo}")
    println("Saldo conta poupança após saque: ${poupanca.saldo}")

    corrente.transfere(poupanca, 100.0)

    println("Saldo conta corrente após fazer transferência: ${corrente.saldo}")
    println("Saldo conta após após receber transferência: ${poupanca.saldo}")
}