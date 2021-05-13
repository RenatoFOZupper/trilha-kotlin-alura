package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaEscopoFuncoes() {
    // Forma comum de resolver o problema
/*
    val endereco: Endereco = Endereco(logradouro = "rua vergueiro", numero = 3185)
    val enderecoEmMaiusculo: String = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
    println(enderecoEmMaiusculo)
*/


/*
    // Resolvendo o problema com uma higher ordem function
    // O let recebe um tipo e retorna um resultado que pode ser outro tipo

    Endereco(logradouro = "rua vergueiro", numero = 3185)
        .let { endereco ->
            "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
    }.let (::println)
*/

/*
    //Tipo Receiver
    // o tipo de retorno do 'apply' é diferente do 'let'. O 'apply' e o 'also' retornam o objeto de contexto,
    // enquanto o 'let', 'run' e 'with' retornam o resultado da expressão lambda


    Endereco(logradouro = "rua vergueiro", numero = 3185)
        .run {
            "$logradouro, $numero".toUpperCase()
        }.let (::println)
*/
    // O run é recomendado quando temos um objeto que queremos fazer inicializacoes e computações no final ao mesmo tempo
    run {
        println("execução do run sem extensão")
    }

    val endereco: Endereco = Endereco()
        // O also tem um objeto de contexto como argumento, vai ter o retorno do proprio objeto como o apply
        // e ele é muito bom para ações que tem o nosso objeto de contexto.
        // Ele também é muito bom para ações que não vão gerar efeitos colaterais
        .also { ("Criando endereço") }
        // O apply vai ter um objeto de contexto como receiver e ele vai devolver o proprio objeto
        .apply {
            logradouro = "rua vergueiro"
            numero = 3185
        }

    // O 'with' não é uma extensão, diferente das outras funções de escopo como let e o apply
    // Ele recebe um objeto de contexto como receiver e o resultado vai ser uma lambda
    with(endereco) {
        "$logradouro, $numero".toUpperCase()
    }.let(::println)


    listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    )
        .filter(predicate = { endereco -> endereco.complemento!!.isNotEmpty() })
        .let(block = (::println))
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

fun teste(teste: Int, bloco: () -> Unit) { }

*/



}