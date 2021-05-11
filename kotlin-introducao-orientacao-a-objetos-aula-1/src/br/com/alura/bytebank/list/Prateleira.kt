package br.com.alura.bytebank.list

data class Prateleira(
    val genero: String,
    val livros: List<Livro>
) {

    //A função sortBy organiza a propria lista e só presente na MutableList
    //A funcao sortedBy retorna uma nova lista organizada pelo criterio informado

    fun organizarPorAutor(): List<Livro> {
        return livros.sortedBy { it.autor }
        //livros.sortBy { it.autor }
        //return livros
    }

    fun organizarPorAnoPublicacao(): List<Livro> {
        return livros.sortedBy { it.anoPublicacao }
        //livros.sortBy { it.anoPublicacao }
        //return livros
    }

}