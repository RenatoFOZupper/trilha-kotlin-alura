package br.com.alura.bytebank.list

fun main() {

    //A MutableList sofre alteração a cada nova organização, de forma que isso impacta na impressão das listas
    // esse é o problema de mutabilidade

    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros)

    val porAutor = prateleira.organizarPorAutor()
    val porAnoPublicacao = prateleira.organizarPorAnoPublicacao()

    porAutor.imprimeComMarcadores()
    println()
    porAnoPublicacao.imprimeComMarcadores()

}