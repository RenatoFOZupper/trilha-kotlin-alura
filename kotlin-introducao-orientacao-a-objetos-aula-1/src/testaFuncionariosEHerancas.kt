fun testaFuncionariosEHerancas() {
    val claudio: Funcionario = Analista(nome = "Claudio", cpf = "111.111.111-11", salario = 1000.0)

    println("Nome: ${claudio.nome}")
    println("CPF: ${claudio.cpf}")
    println("Salario: ${claudio.salario}")
    println("Bonificação: ${claudio.bonificacao().toString()}")
    println()

    val fran: Gerente = Gerente(nome = "Fran", cpf = "222.222.222-22", salario = 2000.0, senha = 1234)

    println("Nome: ${fran.nome}")
    println("CPF: ${fran.cpf}")
    println("Salario: ${fran.salario}")
    println("Bonificação: ${fran.bonificacao().toString()}")

    if (fran.autentica(1234)) {
        println("Autenticou com sucesso")
    } else {
        println("Falha na autenticação")
    }
    println()

    val gui: Diretor = Diretor(nome = "Gui", cpf = "333.333.333-33", salario = 4000.0, senha = 5678, plr = 200.0)
    println("Nome: ${gui.nome}")
    println("CPF: ${gui.cpf}")
    println("Salario: ${gui.salario}")
    println("Bonificação: ${gui.bonificacao().toString()}")
    println("PLR: ${gui.plr}")
    if (gui.autentica(5678)) {
        println("Autenticou com sucesso")
    } else {
        println("Falha na autenticação")
    }
    println()

    val maria: Analista = Analista(nome = "Maria", cpf = "444.444.444-4", salario = 3000.0)

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(claudio)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("Total de bonificação: ${calculadora.total}")

    println()
}