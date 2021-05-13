package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

// Exemplo de uso do with
// primeiro chamamos o with passando o Endereco como argumento
// depois adicionamos as informações no bloco
// depois criamos um método 'completo()' dentro da classe Endereco, esse método é apenas uma concatenacao de Strings
// depois atribuimos uma variavel ao with
// e por ultimo chamos a função de escopo 'let' para imprimir na tela
fun testaWith() {
    val enderecoCompleto = with(Endereco()) {
        logradouro = "rua vergueiro"
        numero = 3185
        bairro = "vila mariana"
        cidade = "São Paulo"
        estado = "SP"
        cep = "02310-063"
        complemento = "Apartamento"
        completo()
    }.let { enderecoCompleto ->
        println(enderecoCompleto)
    }
}