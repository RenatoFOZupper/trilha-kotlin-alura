package br.com.alura.bytebank.list

fun main() {

    listaDeLivros.add(
        Livro(
            titulo = "Sagarana",
            autor = "João Guimarães Rosa",
            anoPublicacao = 1946
        )
    )

    listaDeLivros.imprimeComMarcadores()

    listaDeLivros.remove(livro2)
    println()
    listaDeLivros.imprimeComMarcadores()
    println()

    val ordenadoAnoPublicacao: List<Livro> = listaDeLivros.sorted()
    ordenadoAnoPublicacao.imprimeComMarcadores()
    println()

    // O método 'sortedBy' já faz a ordenação sem a necessidade do 'Comparable' e o 'compareTo'.
    // Basta chamar o método e passar qual o critério de ordenação
    val ordenadoPorTitulo = listaDeLivros.sortedBy { it.titulo }
    ordenadoPorTitulo.imprimeComMarcadores()
    println()

    val ordenadoPorAutor = listaDeLivros.sortedBy { it.autor }
    ordenadoPorAutor.imprimeComMarcadores()
    println()

    // O filter permite buscar um livro com base no critério que informamos e retornar apenas os resultados da busca
    // A função 'starsWith()' espera um parametro do tipo String e busca na lista as String do tipo autor
    // que batem com o nosso critério, eliminando a necessidade de colocar o nome completo do autor
    // Já a função map aqui recebe uma listad e livros, filtra pelo autor e ano de publicacao e cria uma nova lista
    // do tipo String somente dos titulos do autor informado
    val titulos: List<String> = listaDeLivros
        .filter { it.autor.startsWith(prefix = "João") }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }
    println(titulos)
    println()


}



