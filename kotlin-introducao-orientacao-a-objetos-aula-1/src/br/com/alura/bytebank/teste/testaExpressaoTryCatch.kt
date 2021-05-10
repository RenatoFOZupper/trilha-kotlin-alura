package br.com.alura.bytebank.teste

fun testaExpressaoTryCatch() {
    val entrada: String = "1,9".replace(newValue = ".", oldValue = ",")

    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversão")
        e.printStackTrace()
        null
    }

    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        //0.0
        null
    }

    if (valorComTaxa != null) {
        println("Valor recebido: $valorComTaxa")
    } else {
        println("valor inválido")
    }




    /*                      Exemplo de uso do Try/Catch
    try {
        10/0
    }catch (e: ArithmeticException) {
        println("ArithmeticException foi pegada")
    }
    */

    /*
                         Exemplo de uso do método replace()
    println("1,9".replace(oldValue = ",",newValue =  ".",ignoreCase =  false))
    */

    /*                   Exemplo de Early Return
    val valorComTaxa: Double? = valorComTaxa(100.0)

    fun valorComTaxa(valorRecebido: Double?): Double? {
        if (valorRecebido != null) {
            return valorRecebido + 0.1
        }
        return null
    }
    */
}