import br.com.alura.bytebank.modelo.*

fun testaCopiasEReferencias() {

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numero $numeroX")
    println("numero $numeroY")

    val joao:Cliente = Cliente("Joao", "333.333.333-33", 12345)
    val maria:Cliente = Cliente("Maria", "444.444.444-44", 12345)

    val contaJoao = ContaCorrente(joao, 1002)
    var contaMaria = ContaPoupanca(maria, 1003)

    println("titular conta Joao: ${contaJoao.titular.nome}")
    println("titular conta Maria: ${contaMaria.titular.nome}")
}