import modelo.ContaCorrente
import modelo.ContaPoupanca
import modelo.ContaSalario

fun testaContasDiferentes() {
    var corrente = ContaCorrente(titular = "Alex", numero = 1000)
    var poupanca = ContaPoupanca(titular = "Maria", numero = 1001)
    var salario = ContaSalario(titular = "Joao", numero = 1003)
    println()

    corrente.deposita(1000.0)
    poupanca.deposita(1000.0)
    salario.deposita(1000.0)

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

    corrente.transfere(poupanca, 100.0)

    println("Saldo conta corrente após fazer transferência: ${corrente.saldo}")
    println("Saldo conta poupança após receber transferência: ${poupanca.saldo}")
    println()

    poupanca.transfere(corrente, 100.0)

    println("Saldo conta poupança após fazer transferência: ${corrente.saldo}")
    println("Saldo conta corrente após receber transferência: ${poupanca.saldo}")
    println()

}