package br.com.alura.bytebank.list

fun main() {

    // A função grupBy retona uma lista de um elemento especifico que indicamos como parametro, aqui no caso por editora
    // Utilizamos o elvis operator para os casos onde o atributo editora é nulo
    // chamamos o elvis operator e passamos uma String de forma que ele substitua o campo nulo pela String
    listaDeLivros
        .groupBy { it.editora ?: "Editora desconhecida" }
        .forEach { (editora: String?, livros: List<Livro>) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }

}