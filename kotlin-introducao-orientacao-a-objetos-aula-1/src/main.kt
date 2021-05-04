fun main() {

//  testaCondicoes(saldo)
//  testaLacos()
//  testaCopiasEReferencias()

    val contaAlex = Conta("Alex", 1000)
    contaAlex.deposita(200.0)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)
    println()


    // na chamada deste construtor fazemos uso do 'label', que é indicar o campo que está recebendo aquele valor
    // a vantagem dessa abordagem permite a atribuição do campos em qualquer ordem dentro do construtor
    val contaFran = Conta(numero = 1001, digito = 5, titular = "Fran")
    contaFran.deposita(300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)
    println()

    println("Depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)
    println()

    println("Depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)
    println()

    println("Sacando na conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)
    println()

    println("Sacando na conta do Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)
    println()

    println("Saque em excesso na conta do Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)
    println()

    println("Saque em excesso na conta do Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)
    println()

    println("Transferência da conta da Fran para o Alex")
    if (contaFran.transfere(contaDestino = contaAlex, valor = 100.0)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)
}


//  Construtor primário - mais idiomatico ao padrão Kotlin
class Conta(
    var titular: String,
    val numero: Int,
    val digito: Int = 9   //Ao inicializar um campo do construtor, esse campo passa a ser opcional quando for chamado
) {
    var saldo: Double = 0.0
        private set

//  O init executa alguma lógica no momento em que é chamado o construtor primário e ele é opcional
    init {
        println("Nova Conta: $numero - $digito, titular: $titular")
    }

    /*   Constutor secundário = geralmente usado para alguma logica especifica
       constructor(titular: String, numero: Int) {
           this.titular = titular
           this.numero = numero
       }
   */


/*       Modelo não convecional de getters & setters
        set(valor) {
            if (valor > 0) {
                field = valor
            }
        }
        get() { return field }
*/

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        } else {
            println("Valor de $valor excede o limite disponivel")
        }
    }

    fun transfere(contaDestino: Conta, valor: Double): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            contaDestino.deposita(valor)
            return true
        }
        return false
    }

//    fun getSaldo(): Double {
//        return saldo
//    }
//
//    fun setSaldo(valor: Double) {
//        saldo += valor
//    }
}


fun testaCopiasEReferencias() {

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numero $numeroX")
    println("numero $numeroY")

    val contaJoao = Conta("Joao", 1002)
    var contaMaria = Conta("Maria", 1003)

    println("titular conta Joao: ${contaJoao.titular}")
    println("titular conta Maria: ${contaMaria.titular}")
}


fun testaLacos() {
    var i = 0
    while (i < 5) {

        println("Bem vindo ao Bytebank")
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        i++
    }

    for (i in 1..100) {
        println("i $i")
        for (j in 1..100) {
            println("j $j")
            if (j == 5) break
        }
    }

    for (i in 1..5) {
    }
    for (i in 5 downTo 1) {
    }
    for (i in 5 downTo 1 step 2) {
    }
    for (i in 5 downTo 1) {

        if (i == 4) {
            break
        }
        if (i == 4) {
            continue
        }



        println(i)
    }
}

fun testaCondicoes(saldo: Double) {

    if (saldo > 0.0) {
        println("conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }

    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }

}