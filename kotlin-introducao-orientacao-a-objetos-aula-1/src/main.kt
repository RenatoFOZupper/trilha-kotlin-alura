fun main() {


    val pedidos: MutableMap<Int, Double> = mutableMapOf<Int, Double>(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0
    )

    println(pedidos)
    val pedido: Double? = pedidos[3]
    pedido?.let { it: Double ->
        println(" $it")
    }
    for (p: Map.Entry<Int, Double> in pedidos) {
        println("número do pedido: ${p.key}")
        println("valor do pedido: ${p.value}")
        println("\n")
    }

    //Comportamentos de escrita da estutura Map<K, V>
    // Exemplos de como podemos atribuir um elemento a nossa lista Map
    pedidos[4] = 70.0
    println(pedidos)
    pedidos.put(5, 80.0)
    println(pedidos)
    println()

    // Exemplos de como podemos atualizar o valor de um elemento da lista
    pedidos[1] = 100.0
    println(pedidos)
    pedidos.put(1, 90.0)
    println(pedidos)
    println()

    // O 'putIfAbsent' so vai atribuir um elemento na lista caso não exista um elemento ocupando a mesma posição da key
    // Note que após inserir um par de chave e valor na posição 6,
    // ele não permite que ocorra uma atualização na mesma posição
    // Está é uma das formas mais seguras de inserir elementos evitando uma atualização nos valores por engano
    pedidos.putIfAbsent(6, 200.0)
    println(pedidos)
    pedidos.putIfAbsent(6, 500.0)
    println(pedidos)
    println()

    // Exemplo de como remover um elemento da ista Map
    pedidos.remove(6)
    println(pedidos)
    println()

    // Aqui o remove recebe um sobrecarga, onde ele so vai remover o elemento na posição 3,
    // caso o valor corresponda ao valor que indicamos
    pedidos.remove(3, 100.0)
    println(pedidos)
    println()



    //Map<K, V> e mapOf<>()
    //O map é uma estrutura de Key & Value/ Chave & Valor
    //Precisamos chamar o 'Pair' para indicar que determinados elementos compoe a chave e o valor

    //O 'to' é um infex que nada mais é que um sintaxe sugar do Pair, porém ele não é indicado para
    //coleçoes grandes, pois pode apresentar alguns problemas de performance

    //O map também não trabalha com indice. Enquanto no List[0] ele imprime o elemento na posição 0 da lista,
    //o Map[0] não funcionam, pois não atribuimos nenhuma chave na posição 0, somente da 1 em diante

    //O 'Entry' é a interface que implementa a interface map. A partir do entry podemos acessar a key e o value

    /*
    val pedidos = mapOf<Int, Double>(Pair(1, 20.0), Pair(2, 34.0), 3 to 50.0)
    println(pedidos)
    val pedido: Double? = pedidos[3]
    pedido?.let { it: Double ->
        println(" $it")
    }
    for (pedido: Map.Entry<Int, Double> in pedidos) {
        println("número do pedido: ${pedido.key}")
        println("valor do pedido: ${pedido.value}")
        println("\n")
    }
*/

}





