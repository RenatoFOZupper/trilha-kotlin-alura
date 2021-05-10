package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaNullSafety() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "rua vergueiro", complemento = "prédio")
    var enderecoNovo: String? = enderecoNulo?.logradouro
    //enderecoNulo = null

    enderecoNulo?.let {
        println(it.logradouro.length)
        val tamanhoComplemento: Int =
            it.complemento?.length ?: throw IllegalStateException("complemento não pode ser vazio")
        println(tamanhoComplemento)
    }


    fun teste(valor: Any) {
        val numero: Int? = valor as? Int
        println(numero)
    }

    teste("")
    teste(1)
}


/*
O método let funciona como se fosse if para nulo, onde caso o objeto seja nulo, ele não vai entrar no bloco do let
*/

/*
O it é um referência ao tipo implicito, perceba que em nenhum momento
indicamos qual o tipo para executar determinada função

enderecoNulo?.let {
    println(it.logradouro)
}
ou
 enderecoNulo?.let { endereco: Endereco ->
    println(endereco.logradouro)
}

*/

/* O Safe Call do Null Safety é indicado pelo '?' no final da property. Dessa forma indicamos que aquela property, função ou classe pode receber nulo.
 Isso se aplica também a qualquer método ou variável da property que estamos chamando
*/

/*
O Elvis Operator funciona de forma semelhante ao condicional ternário,
onde podemos definir um valor caso o resultado seja nulo

val tamanhoComplemento: Int = it.complemento?.length ?: 0
*/

/*O not null assertion operator (!!) é usado quando queremos converter qualquer valor para um tipo nao nulo e caso o valor seja nulo, é lançado um NullPointerException
O recomendado é evitar ao máximo o uso desse operador

val b: String? = null
val l = b!!.length
 */