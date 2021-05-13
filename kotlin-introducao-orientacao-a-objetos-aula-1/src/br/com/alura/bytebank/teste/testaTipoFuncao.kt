package br.com.alura.bytebank.teste

fun testaFuncaoAnonima() {
    //Exemplo de função anonima
    // Optamos por usar a funcao anonima, quando queremos deixar bem claro os parametros que queremos colocar,
    // o tipo do retorno e também o escopo de execução do código. Lembrando que ele retorna como uma funcao mesmo.
    // Resumidamente é uma maneira mais explicita de executar uma funcao como uma funcao lambda
    val minhaFuncaoAnonima: (Int, Int) -> Int = fun(a, b): Int {
        println("Executa como funcao anonima")
        return a + b
    }
    println(minhaFuncaoAnonima(20, 10))


    // A função anonima tem quase a mesa regra, mas ela não precisa do jump para retornar o tipo correto
    // Além do fato que ela é mais expressiva
    val calculaBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if (salario > 1000.0) {
            return salario + 50
        }
        return salario + 100.0
    }
    println(calculaBonificacaoAnonima(1000.0))
}

fun testaFuncaoLambda() {
    /* Primeiro exemplo de função lambda
    Tanto a função lambda quanto a anonima são tipo função e funcionam de forma semelhante
    Exemplo de expressão Lambda

    val minhaFuncaoLambda: () -> Unit = {
        println("Executa como lambda")
    }
    println(minhaFuncaoLambda())
*/

    // A esquerda definimos o tipo que a gente espera: (Int, Int) -> Int
    // A direita depois do mustache, precisamos que o código compile: a, b -> ...
    // Dado que a função recebe dois inteiros e retorna um inteiro, só o println não resolve, pois o seu tipo é Unit
    // para resolver esse problema apenas executamos a soma dos dois inteiros que recebemos como argumento
    // Na expressão lambda, a última expressão é o seu retorno
    // Um ponto interessante é que as vezes vamos implementar parametros que não vamos usar.
    // Para esse caso, no lugar do a + b da direita, podemos trocar por _, _.
    // Dessa forma o Kotlin entende que nao vamos utilizar esses parametros
    val minhaFuncaoLambda: (Int, Int) -> Int = { a, b ->
        println("Executa como lambda")
        a + b
    }
    println(minhaFuncaoLambda(15, 10))

    // Por padrao o retorno dessa expressão lambda seria do tipo Unit, pois é o tipo da função main
    // Para contornar essa situação podemos chamar o 'jump' colocando uma palavra seguida do @ antes do bloco
    // e outra no retorno da nossa função, dessa forma a expressão lambda retorna o que desenvolvemos
    val calculaBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if (salario > 1000.0) {
            return@lambda salario + 50
        }
        return@lambda salario + 100.0
    }
    println(calculaBonificacao(1000.0))
    println()
}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasses: (Int, Int) -> Int = SomaPorClasse()
    println(minhaFuncaoClasses(10, 10))
}

fun testaTipoFuncaoReferencia() {
    // O tipo função geralmente tem essa assinatura: parenteses, uma seta apontando o para o tipo de retorno da função
    // Os ::soma indica que estamos mandando a referência da função. Isso também é conhecido como Lazy Evaluation
    // Quando for utilizar o tipo função, ele precisa ser igual a referência da função que estamos mandando
    // ou igual ao que queremos inicializar
    val minhaFuncao: (Int, Int) -> Int = ::somaPorReferencia
    // Para executar a função teste, precisamos assumir que a variavel minhaFuncao também é uma função
    // println(minhaFuncao)
    println(minhaFuncao(5, 10))
}

fun somaPorReferencia(a: Int, b: Int) : Int {
    return a + b
}

// O retorno pode ser em bloco {} ou em expressão
// Retorno em expressao
class SomaPorClasse : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int = a + b

    /* Primeiro exemplo do tipo funcao classe

    fun testaTipoFuncaoClasse() {
        val minhaFuncaoClasses: () -> Unit = Teste()
        println(minhaFuncaoClasses())
    }

    //Retorno em bloco
class Teste : () -> Unit {
    override fun invoke() {
        println("Executa o invoke do teste")
    }
*/


}