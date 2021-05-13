import br.com.alura.bytebank.modelo.Endereco

fun main() {

    // Forma comum de resolver o problema
//    val endereco: Endereco = Endereco(logradouro = "rua vergueiro", numero = 3185)
//    val enderecoEmMaiusculo: String = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(enderecoEmMaiusculo)

    // O let recebe um tipo e retorna um resultado que pode ser outro tipo
    Endereco(logradouro = "rua vergueiro", numero = 3185)
        .let { endereco ->
            "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
    }.let (::println)



/*

    val testeFuncao: () -> Unit
    Endereco().let {
        it
    }
    "".let(::testeRecebeString)
    1.let {
        it
    }
    teste (1, { } )

}

fun testeRecebeString(valor: String) { }

                               higher order function
   A função de alta ordem, é quando temos uma função que recebe ou devolve uma função

fun teste(teste: Int, bloco: () -> Unit) {

}
*/

}












