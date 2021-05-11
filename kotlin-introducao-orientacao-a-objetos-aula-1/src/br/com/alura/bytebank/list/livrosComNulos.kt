package br.com.alura.bytebank.list

    /*
        <<=========================== Lista de Livros Nulos ======================================>>
     */

// Lidando com objetos nulos
// Para isso precisamos colocar o operador '?' no tipo dentro generics da lista

val listaLivrosComNulos: MutableList<Livro?> = mutableListOf(
    null,
    Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    ),
    null,
    Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    ),
    Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    ),
    null,
    Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    ),
    null,
    Livro(
        titulo = "A terceira margem do rio ",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1962
    )
)
