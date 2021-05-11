package br.com.alura.bytebank.array

import java.math.BigDecimal
import java.math.RoundingMode

fun testaCalculoRelativoSalarial() {

    /* Aqui a proposta é que todos funcionarios devem ter um aumento de 10%, mas o minimo do aumento deve ser 500 reais */

    /*
     Pelo fato do BigDecimal nao ser um tipo primitivo da linguagem, precisamos instaciar um array passando o tipo BigDecimal pelo generecis
     e além disso precisamos iniciar os seus valores e para isso utilizamos o método 'zero', dessa forma todos os valores do array iniciam com o zero.
     Outro ponto interessante é que o mais indicado para trabalhar com BigDecimal é o String. Se optassemos pelo double, teriamos problemas com o arredondamento.
     Então passamos o valor como String e chamamos o método 'toBigDecimal', assim ele converte o valor da nossa String para o tipo BigDecimal
     e garante que o valor não sofra alterações
     */

/*  // Primeira forma de criar um Array de BigDecimal

    val salarios = Array<BigDecimal>(2) { BigDecimal.ZERO }
    salarios[0] = "1500.55".toBigDecimal()
    salarios[1] = "2000.00".toBigDecimal()

    println(salarios.contentToString())
*/
    // Note que quando chamamos a função map, ela retorna uma nova lista e essa lista é do tipo List do java,
    // depois chamamos a função 'toTypedArray()' que converte essa lista para uma lista de Array tipada
    // O método 'setScale()' é para deixarmos explicito a quantidade de casas que queremos depois do ponto ou virgula.
    // Para isso passamos a quantidade de casas e chamamos o método RoundingMode.UP para arredondar para cima


    val salarios = bigDecimalArrayOf("1500.55", "2000.0", "5000.0", "10000.0")
    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento)}
        .toTypedArray()
    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()
    println(gastoInicial)

    //A função 'fold()' funciona de forma semelhante ao reduce. A principal diferença é que o fold recebe um valor inicial
    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println(gastoTotal)

    /*
      Ao inves de criar tres variaveis que apenas vamos usar ua vez, podemos criar uma concatenando todos os métodos
      Sorted() == devolve uma lista ordenada do menor para o maior
      takeLast() == pega n valores que passarmos no parametro
      toTypeArray() == converte para uma array tipado
      media() == é o método que criamos para levantar a media

      val salariosOrdenados = salariosComAumento.sorted()
      val tresUltimosSalarios: Array<BigDecimal> = salariosOrdenados.takeLast(3).toTypedArray()
      val media = tresUltimosSalarios.media()
      */

    val media: BigDecimal = salariosComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()

    println("Média dos 3 maiores salários: $media")

    val mediaMenoresSalarios = salariosComAumento
        .sorted()
        .take(3)
        .toTypedArray()
        .media()

    println("Média dos 3 menores salários: $mediaMenoresSalarios")
}


private fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal) : BigDecimal {
    return if (salario < "5000.0".toBigDecimal()) {
        salario + "500.0".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }
}



