package br.com.alura.bytebank.teste

fun testaCopia() {
    /*
    Mesmo aplicando a logica de isolar o metodos da classe mutavel no companion object, é possivel
    atribuir valores na lista criando uma variavel dessa lista e fazendo o cast. Dessa forma infrigimos
    os principios de encapsulamento. Mas para evitar esse comportamento, chamamos o método 'toList()'
    na nossa colecao. Esse método devolve uma copia da lista de forma que sempre alguem tentar adicionar
    ou remover algum elemento, o código quebra
    */

    val banco = BancoDeNomes()
    val nomesSalvos: Collection<String> = banco.nomes
    //val nomesSalvos: MutableCollection<String> = banco.nomes as MutableCollection<String>
    banco.salva("Alex")
    //nomesSalvos.add("Paulo")
    println(nomesSalvos)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes {
    // Colecao imutavel publica devido a interface Collection
    val nomes: Collection<String> get() = Companion.dados.toList()

    fun salva(nome: String) {
        Companion.dados.add(nome)
    }

    companion object {
        // Lista mutavel interna devido a interface mutableListOf
        // Encapsulamento do método add, dessa forma somente a propria classe pode salvar elementos na lista
        private val dados = mutableListOf<String>()
    }
}

fun testaColecao() {
    val nomes: Collection<String> = mutableListOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria",
        "Ana"
    )
    println(nomes)

    for (nome in nomes) {
        println(nome)
    }
    //Implementado no topo da hierarquia das estruturas == Iterable
    println("Tem o nome Alex? ${nomes.contains("Alex")}")

    //Implementado na segunda familia == Collection
    println("Tamanho da coleção? ${nomes.size}")

    //Implementado na guarta familia == MutableCollection
    //nomes.add("Paulo")
    //nomes.remove("Alex")
}