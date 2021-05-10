package br.com.alura.bytebank.teste

import br.com.alura.bytebank.exception.SaldoInsuficienteException

fun funcao1(){
    println("início funcao1")
    try {
        funcao2()
    } catch (e: SaldoInsuficienteException) {
        //println(e.message)
        //println(e.stackTrace)
        //println(e.cause)
        //println()
        println(e.printStackTrace())
        println("SaldoInsuficienteException foi pegada")
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5) {
        println(i)
        throw RuntimeException()
    }
    println("fim funcao2")
}