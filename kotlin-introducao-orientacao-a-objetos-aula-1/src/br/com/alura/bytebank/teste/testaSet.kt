package br.com.alura.bytebank.teste

fun testaSet() {
    val assistiramCursoAndroid: Set<String> = setOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin: Set<String> = setOf("Alex", "Paulo", "Maria")

    //val assistiramAmbos: Set<String> = assistiramCursoAndroid + assistiramCursoKotlin
    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Ana")
    println(assistiramAmbos)

    // Metodos especificos da lista Set
    //O union retorna uma nova lista fazendo a junção das duas listas
    println(assistiramCursoKotlin + assistiramCursoAndroid)
    println(assistiramCursoKotlin union assistiramCursoAndroid)

    //O subtract devolve uma nova lista fazendo a remoção dos elementos da sugnda lista e que se repetem na primeira lista
    println(assistiramCursoAndroid - assistiramCursoKotlin)
    println(assistiramCursoAndroid subtract assistiramCursoKotlin)

    //O intersect pega os elementos em comum nas duas listas e atribui a uma nova lista
    println(assistiramCursoKotlin intersect assistiramCursoAndroid)

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Alex")
    println(assistiramList)
    println(assistiramList.toSet())

    /*
     É possivel criar uma lista que faz a junção das duas listas
     Chamamos o método distinc() para que ele faça uma distinção entre os elementos da lista
     */
    /*   val assistiramCursoAndroid: List<String> = listOf("Alex", "Fran", "Gui", "Maria")
       val assistiramCursoKotlin: List<String> = listOf("Alex", "Paulo", "Maria")

       val assistiramAmbos: List<String> = assistiramCursoAndroid + assistiramCursoKotlin

      println(assistiramAmbos.distinct())
      println(assistiramAmbos[0])
    */
    /*
    val assistiramAmbos: MutableList<String> = mutableListOf()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    */
}