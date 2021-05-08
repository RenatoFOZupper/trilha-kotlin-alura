package br.com.alura.bytebank.modelo

fun testaAny() {
    val endereco: Endereco = Endereco()

    val objeto: Any = Any()


    fun imprime(valor: Any): Any {
        println(valor)
        return valor
    }

    imprime(objeto)

    imprime(1)
    imprime(1.0)
    val teste: Any = imprime(endereco)
    println(teste)


}