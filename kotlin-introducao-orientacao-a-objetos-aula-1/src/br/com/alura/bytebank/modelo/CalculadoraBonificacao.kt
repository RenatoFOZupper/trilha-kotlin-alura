package br.com.alura.bytebank.modelo

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        println("Nome: ${funcionario.nome}")
        this.total += funcionario.bonificacao()

      /*                         Cast
     val novoFuncionario: Funcionario = funcionario as Funcionario


              Smart Cast - Verifica o tipo e depois faz o cast
        if (funcionario is Funcionario) {
            println("Nome: ${funcionario.nome}")
            this.total += funcionario.bonificacao()
        }
        */

    }

//    fun registra(gerente: br.com.alura.bytebank.modelo.Gerente) {
//        this.total +=  gerente.bonificacao()
//    }
//
//    fun registra(diretor: br.com.alura.bytebank.modelo.Diretor) {
//        this.total += diretor.bonificacao()
//    }

}