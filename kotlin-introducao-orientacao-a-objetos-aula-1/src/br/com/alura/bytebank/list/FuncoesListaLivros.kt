package br.com.alura.bytebank.list

// A função 'joinToString' é propria da interface List e ela recebe uma
// função onde cada elemento do livro recebe uma linha
// Incluimos o filterNotNull() para eliminar os possiveis elementos nulos da nossa lista
fun List<Livro?>.imprimeComMarcadores() {
    val textoFormato = this
        .filterNotNull()
        .joinToString(separator = "\n") { livro ->
        " - ${livro.titulo} de ${livro.autor}"
        }
    println(" ###### Lista de Livros ###### \n$textoFormato")
}