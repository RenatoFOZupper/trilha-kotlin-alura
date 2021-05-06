fun testaCopiasEReferencias() {

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numero $numeroX")
    println("numero $numeroY")

    val contaJoao = ContaCorrente("Joao", 1002)
    var contaMaria = ContaPoupanca("Maria", 1003)

    println("titular conta Joao: ${contaJoao.titular}")
    println("titular conta Maria: ${contaMaria.titular}")
}