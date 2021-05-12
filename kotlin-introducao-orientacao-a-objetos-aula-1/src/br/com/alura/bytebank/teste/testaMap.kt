package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Pedido

fun testaMap(pedidos: MutableMap<Int, Double>) {
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

fun testaComportamentosMap() {
    //Comportamentos especificos da estrutura Map para leitura ou escrita

    val pedidos: MutableMap<Int, Double> = mutableMapOf<Int, Double>(
        Pair(1, 20.0),
        Pair(2, 64.0),
        3 to 50.0,
        4 to 100.0,
        5 to 100.0,
        6 to 80.0
    )

    /*
     O get() retorna um valor e caso o elemento nao exista, ele devolve um nulo
     O getValue() retorna um valor, porém caso o elemento nao exista, ele retorna uma exception

     val valorPedido: Double? = pedidos.get(5)
     val valorPedido: Double? = pedidos.getValue(5)
     println(valorPedido)
    */

    // Retorna o valor da chave, porém caso não exista retorna a função dentro do bloco
    val msgGetOrElse = pedidos.getOrElse(key = 5, defaultValue = {
        "Não tem o pedido"
    })
    println(msgGetOrElse)
    println()

    //Retorna o valor da chave, porém caso nao exista retorna um valor padrão
    val msgGetOrDefault = pedidos.getOrDefault(key = 0, defaultValue = -1.0)
    println(msgGetOrDefault)
    println()

    //É possivel pegar todas as chaves (keys) ou os valores (values)
    println(pedidos.keys)
    println(pedidos.values)
    println()

    for (numeroDePedido in pedidos.keys) {
        println("Pedido: $numeroDePedido")
    }

    for (valor in pedidos.values) {
        println("Valor do pedido: $valor")
    }
    println()

    // Sobre opções de filtros da estrutura Map()
    //O filter espera sempre dois parametros (K, V) e aplica uma função para cada elemento
    // filtrando apenas os correspondentes
    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 70.0
    }
    println(pedidosFiltrados)
    println()

    //O filterValues espera um valor e filtra apartir da condição da função
    val pedidosAcimeDe = pedidos.filterValues { valor ->
        valor > 50.0
    }
    println(pedidosAcimeDe)
    println()

    //O filterKeys espera uma key e filtra apartir da condição da função
    val pedidosPares = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }
    println(pedidosPares)
    println()

    // Sobre Plus e Minus na estrutura Map()
    // Podemos fazer somar uma chave ou outra lista a nossa lista atraves do operador + ou plus
    // Note que a lista original não é alterada, ou seja, precisamos atribuir o resultado da soma a uma nova lista
    // Note também que só possivel fazer uso da sintaxe sugar 'to' dentro dos parenteses do mapOf()
    println(pedidos + Pair(7, 50.0))
    println(pedidos.plus(Pair(7, 80.0)))
    println(pedidos)
    println()

    println(pedidos + mapOf(7 to 90.0, 8 to 20.0))
    println(pedidos.plus(mapOf(7 to 90.0, 8 to 20.0)))
    println(pedidos)
    println()

    // Podemos fazer remover uma chave ou outra lista a nossa lista atraves do operador - ou minus
    // Note que a lista original não é alterada, ou seja, precisamos atribuir o resultado da remoção a uma nova lista
    // Note também que só possivel fazer remover varios elementos usando a estrutura listOf
    println(pedidos - 6)
    println(pedidos.minus(6))
    println(pedidos)
    println()

    println(pedidos - listOf(6, 5, 4))
    println(pedidos.minus(listOf(1, 3, 5)))
    println(pedidos)
    println()

    // Temos tambem o ('plusAssign' == +=) e o ('minusAssign' == -=) apenas para estuturas map mutaveis ou MutableMap
    // No caso do plusAssign e o minusAssign, ele altera de fato a nossa lista original

    // O putAll permite adicionar elementos a lista. Para isso chamamos o setOf ou listOf e passamos o conjunto do Pair
    // Além disso o putAll permite a sobre escrita de algum conjunto do Pair dentro da lista Map
    pedidos.putAll(setOf<Pair<Int, Double>>(7 to 90.0, 8 to 20.0))
    println(pedidos)
    println()

    // Podemos também a inclusão com os operadores += ao inves de chamar o putAll
    pedidos += setOf<Pair<Int, Double>>(7 to 50.0, 8 to 30.0)
    println(pedidos)
    println()

    // O remove faz remoção de um elemento da lista passando apenas a chave do elemento
    pedidos.keys.remove(1)
    println(pedidos)
    println()

    // usand o minusAssign só conseguimos remover com base na chave, para o valor esse método já nao funciona
    pedidos -= 3
    println(pedidos)
    println()

    //O remove pode fazer a remoção também pelo valor da chave chamando o values.remove() e o valor a ser inserido
    // Aqui tem um detalhe interessante é que o remove faz a remoção do primeiro elemento que ele enontrar na lista
    // com valor que passamos, mas caso exista outro elemento com o mesmo valor, ele fará somente a remoção do primeiro
    pedidos.values.remove(100.0)
    println(pedidos)
    println()
}

fun testaMapFuncoes() {
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0),
        Pedido(5, 40.0)
    )
    println(pedidos)
    println()

    /*
     O associate permite a associacao de um objeto a estrutura Map
     Além do Pair, poderiamos usar a sintaxe sugar 'to' para fazer a associacao. Ex: pedido.numero to pedido
     dentro da função

     val pedidosMapeados: Map<Int, Pedido> = pedidos.associate { pedido: Pedido ->
        Pair(pedido.numero, pedido)
     }
    */

    // O associateBy é uma forma mais enxuta de de usar o associate
    val pedidosMapeados = pedidos.associateBy { pedido -> pedido.numero }

    println(pedidosMapeados)
    println(pedidos[1])
    println()

    // O associateWith é a ideia contraria do associate, ele vai pegar cada um dos elementos e transformar em chave
    // e então permitir que a gente associe com algum outro valor, baseando se em alguma computação.
    // Aqui no caso foi para calcular o frete ou nao. Mas poderia ser qualquer outra coisa,
    // como calcular se o pedido tem quantidades acima 10 ou menor que 10 e etc
    val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFreteGratis)
    println()
    println(pedidosFreteGratis[Pedido(numero = 2, valor = 60.0)])
    println()

    /*
    val pedidosFreteGratis = pedidos.associateWith { pedido ->
        if (pedido.valor > 50.0) {
            println("Pedido: $pedido com o valor $ ${pedido.valor} tem direito a frete grátis.")
        }
    }
    */

/*

     Note que ao tentar inverter o processo, o resultado é diferente.
     Isso ocorre pq a chave só retorna uma chave do mesmo tipo e ela sempre vai retornar o ultimo resultado encontrado

     val mapa: Map<Boolean, Pedido> = pedidos.associateBy { pedido ->
         pedido.valor > 50.0
     }
     println(mapa)
*/

    // Já o método groupBy consegue executar a operação de cima. Ele vai criar uma coleção dos valores separados
    // pela chave booleana
    val pedidosFreteGratisAgrupados: Map<Boolean, List<Pedido>> = pedidos.groupBy { pedido: Pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFreteGratisAgrupados)
    println()
    println("Pedidos com o frete grátis: ${pedidosFreteGratisAgrupados[true]}")
    println()
    println("Pedidos com o frete pago: ${pedidosFreteGratisAgrupados[false]}")
    println()

    val nomes = listOf("Alex", "Fran", "Gui", "Ana", "Paulo", "Maria", "Mario", "Gisele", "Renato")
    val agenda: Map<Char, List<String>> = nomes.groupBy { nome ->
        nome.first()
    }
    println(agenda)
    println()
    println(agenda['A'])
}

