package br.com.alura.bytebank.teste

fun testaIteracoesSobreArray() {
    //Para o tipo de dado BigDecimal, o melhor indicado seria o List

    val salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)

    val aumento = 1.1

    // Aqui o aumento é aplicado baseado no indice da lista
    for (indice in salarios.indices) {
        salarios[indice] = salarios[indice] * aumento
    }
    println(salarios.contentToString())
    println()

    // Aqui podemos aplicar o aumento baseado no indice ou em cada salario.
    // Perceba que de todos os exemplos, esse é o único que permite a iteração pelo indice (i) ou salario (salario)
    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }
    println(salarios.contentToString())


    /*
    //Aqui o aumento é aplicado para cada salario da lista
    var indice = 0
    for(salario in salarios) {
        salarios[indice] = salario * aumento
        indice++
    }
    println(salarios.contentToString())
    */

    /*
    salarios.forEach { salario ->
        val salarioAumentado = salario * aumento
        println(salarioAumentado)
    }
    */
}