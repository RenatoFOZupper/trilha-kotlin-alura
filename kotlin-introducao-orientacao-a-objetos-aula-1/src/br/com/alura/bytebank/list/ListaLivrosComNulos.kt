package br.com.alura.bytebank.list

fun main() {
    // Para chamar o método 'imprimeComMarcadores()', precisamos alterar essa função,
    // incluindo também o filterNotNull() para eliminar os possiveis elementos nulos da nossa lista,
    // dessa forma evitamos o NullPointerException e excluimos os elementos nulos da lista

    listaLivrosComNulos.imprimeComMarcadores()

}