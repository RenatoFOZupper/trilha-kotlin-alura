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