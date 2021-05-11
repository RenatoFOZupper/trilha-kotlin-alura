package br.com.alura.bytebank.list

// A data class oferece algumas funções a mais que a class, como o toString(), Equals() e HashCode().
// Essas funções já vem implementadas por padrão na data class, sem a necessidade da sobre escrita
// Para criar uma lista ordenada do tipo Livro, a classe livro precisa herdar de 'Comparable<Livro>'
// Ela vai herdar o métodod 'compareTo' e para ordernar precisamos selecionar um elemento que seja comparavel, tipo o Long
data class Livro(
    val titulo: String,
    val autor: String,
    val anoPublicacao: Long,
    val editora: String? = null
) : Comparable<Livro> {
    override fun compareTo(other: Livro): Int {
        return this.anoPublicacao.compareTo(other.anoPublicacao)
    }
}