import modelo.Cliente
import modelo.Diretor
import modelo.Gerente
import modelo.SistemaInterno

fun testaAutenticacao() {
    val diretor = Diretor(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 2000.0,
        senha = 12345,
        plr = 200.0
    )

    val gerente = Gerente(
        nome = "Maria",
        cpf = "222.222.222-22",
        salario = 1500.0,
        senha = 12345
    )

    val cliente: Cliente = Cliente(
        nome = "Gui",
        cpf = "555.555.555-55",
        senha = 1234
    )

    val sistema = SistemaInterno()

    sistema.entra(gerente, 12345)
    sistema.entra(diretor, 12345)
    sistema.entra(cliente, 1234)





}