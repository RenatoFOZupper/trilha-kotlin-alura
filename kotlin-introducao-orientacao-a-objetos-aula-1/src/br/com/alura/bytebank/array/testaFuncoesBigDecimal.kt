package br.com.alura.bytebank.array

import java.math.BigDecimal

// Com o 'vararg' podemos passar argumentos variaveis para uma função
// Aqui pegamos cada valor de 'valores', acessando pelo indice 'i' e convertendo ele para BigDecimal
fun bigDecimalArrayOf(vararg valores:String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}

// Extension function de somatoria de BigDecimal
// A função 'reduce()' tem dois parametros: o acumulador e o valor. O valor corresponde a cada valor da nossa lista,
// já o acumulador é uma variavel que guarda o valor e soma com o proximo.
// Outro ponto interressante é que o reduce pode ser usado com os outros operadores aritmeticos
fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}

fun Array<BigDecimal>.media(): BigDecimal {
    return if (this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.somatoria() / this.size.toBigDecimal()
    }
}