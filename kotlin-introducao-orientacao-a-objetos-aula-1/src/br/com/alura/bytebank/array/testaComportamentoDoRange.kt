package br.com.alura.bytebank.teste

fun testaComportamentoDoRange() {
    //A funcção 'in' dentro do for ele vai pegar cada valor da lista (serie) e jogar para o lado esquerdo (s)

    val serie = 1.rangeTo(10)
    for (s in serie) {
        print("$s ")
    }
    println()
    println()

    // Uma forma mais simplificada (sintaxe sugar) de usar o 'rangeTo' e através do operador '..'
    // Note que no caso o o limite do range também é incluido na serie

    val numeroPares = 0..100 step 2
    for (numeroPar in numeroPares) {
        print("$numeroPar ")
    }
    println()
    println()

    // Outra forma  de usar o 'rangeTo' e através do método 'until'. Funciona de forma semelhante ao modelo acima
    // Note que no caso o o limite do range (100) não é incluido no final da serie

    val numerosParesComUntil = 0.until(100) step 2
    numerosParesComUntil.forEach {
        print("$it ")
    }
    println()
    println()

    //Para imprimir os resultados de uma lista de forma regressiva, utilizamos o método 'downTo'
    val numerosParesReverso = 100 downTo 0 step 2
    numerosParesReverso.forEach {
        print("$it ")
    }
    println()
    println()

    //Uma forma interessante de uso do range é para verificar se um salario está dentro ou não do intervalo
    // A função 'in' dentro if funciona de forma diferente do for.
    // Ele verifica se cada valor do lado esquerdo (salario) está dentro dentro do lado direito (intervalo)
    val intervalo = 1500.0..5000.0
    val salario = 5001.0
    if (salario in intervalo) {
        println("Está dentro do intervalo")
    } else {
        println("Não está dentro do intervalo")
    }
    println()

    //Podemos utilizar o range para outros valores alem de inteiros e doubles.
    // Aqui tem um detalhe interessante, o alfabeto está definido apenas para caracteres minusculos,
    // caso a letra seja maiuscula, o valor será falso
    val alfabeto = 'a'..'z'
    val letra = 'K'
    println(letra in alfabeto)
}