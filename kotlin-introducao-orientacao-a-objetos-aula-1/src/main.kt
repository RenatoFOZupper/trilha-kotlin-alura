fun main() {

//  var saldo: Double = 100.0
//  testaCondicoes(saldo)
//  testaLacos()
//  testaCopiasEReferencias()
//  testaCompartamentosConta()
//  testaFuncionariosEHerancas()
//  testaContasDiferentes()

    val diretor = Diretor(nome = "Alex", cpf = "111.111.111-11", salario = 2000.0, senha = 12345, plr = 200.0)
    val gerente = Gerente(nome = "Maria", cpf = "222.222.222-22", salario = 1500.0, senha = 6789)

    val login = SistemaInterno()

    login.autoriza(gerente, gerente.senha)
    login.autoriza(diretor, diretor.senha)





}











