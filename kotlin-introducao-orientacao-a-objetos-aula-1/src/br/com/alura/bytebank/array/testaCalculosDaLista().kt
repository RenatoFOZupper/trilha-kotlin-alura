package br.com.alura.bytebank.teste

fun testaCalculosDaLista() {
    //A função 'max()' retorna o maior valor da lista
    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)
    val maiorIdade = idades.max()
    println("Maior idade: $maiorIdade")

    //A função 'min()' retorna o menor valor da lista
    val menorIdade = idades.min()
    println("Menor idade: $menorIdade")

    //A função 'average()' retorna a media dos valores da lista
    val media: Double = idades.average()
    println("A média de idade: $media")

    //A função 'all' vai retornar um booleano baseado na condição que colocamos
    val todosMaiores = idades.all { it >= 18 }
    println("Todos maiores de idade? $todosMaiores")

    //A função 'any' retorna true se ao menos um dos valores satisfazer a condição
    val existeMaior = idades.any { it >= 18 }
    println("Algum maior de idade? $existeMaior")

    //A função 'filter' retorna apenas os valores que atendem a condição
    val maiores = idades.filter { it >= 18 }
    println("Maiores de 18: $maiores")

    //A função 'find' retorna o primeiro/ único valor que atende a condição, caso contrário retorna nulo
    val buscaIdade18 = idades.find { it == 18 }
    println("Busca: $buscaIdade18")
}