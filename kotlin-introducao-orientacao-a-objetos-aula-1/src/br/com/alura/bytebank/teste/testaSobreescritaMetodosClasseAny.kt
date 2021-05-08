package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaSobreescritaMetodosClasseAny() {
    /*
    Como todos os objetos em Kotlin herdm de Any, por padrão eles recebem os métodos
    equals, hashcode e toString
*/
    val endereco: Endereco = Endereco(logradouro = "rua vergueiro", complemento = "Alura", cep = "00000-000")
    val enderecoNovo: Endereco = Endereco(logradouro = "rua vergueiro", cep = "00000-000", complemento = "Alura")

    println()
    println("Testando o Equals()")
    /*
                   Testando o equals()
    equals(): deve devolver true quando for o mesmo objeto e false caso sejam diferentes;
    */
    println(endereco.equals(enderecoNovo))

    println()
    println("Testando o HashCode()")
    /*
                   Testando o hashCode()
    hashCode(): deve apresentar o código de cada objeto com valores diferentes.
    */
    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println()
    println("Testando o toString()")
/*
    Testando o toString()
    toString(): deve apresentar o nome da classe e o código do objeto diferentes para cada objeto;
*/
    println(endereco.toString())
    println()
    println(enderecoNovo.toString())

    println()

    println("${endereco.javaClass}@${Integer.toHexString(endereco.hashCode())}")
}