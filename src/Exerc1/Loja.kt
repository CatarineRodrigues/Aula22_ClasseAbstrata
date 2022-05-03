package Exerc1

import kotlin.system.exitProcess

fun main() {

    val livroHistoria = Livros("Jogos Vorazes", 25.90, 7894560, "Suzane Collins")
    val cdMusica = CDs("Marron 5", 22.90, 123456, 10)
    val dvdFilme = DVDs("Avengers: End Game", 79.90, 4569632, 182)

    while (true) {
        println("Quantos produtos deseja cadastrar?")
        val qnt = readln().toInt()

        for (i in 0 until qnt) {
            println("Deseja realizar o cadastro de qual produto?\n L-Livros ou C-CDs ou D-DVDs")
            val tipo = readln().uppercase()
            println("-----Cadastro-----")
            when {
                (tipo.equals("L")) -> {
                    println("-------Livro-------")
                    livroHistoria.mostrarDetalhesDoItem()
                }
                (tipo.equals("C")) -> {
                    println("-------CD-------")
                    cdMusica.mostrarDetalhesDoItem()
                }
                (tipo.equals("D")) -> {
                    println("-------DVD-------")
                    dvdFilme.mostrarDetalhesDoItem()
                }
                else -> {
                    println("Não trabalhamos com esse produto")
                }
            }
        }
        while (true) {
            println("Deseja fazer outro teste? Sim ou Não?")
            when (readln().uppercase()) {
                "SIM" -> {
                    println("Inicializando novamente")
                    break
                }
                "NÃO" -> {
                    println("Obrigado por usar nosso sistema")
                    exitProcess(0)
                }
                else -> println("Resposta inválida!")
            }
        }
    }
}

/*

b) Sobrescreva o método equals() retornando true se dois produtos possuem o mesmo código de barras;
c) Na classe Loja, implemente um simples procedimento de busca que, dado um produto e um vetor de
produtos, indique em que posição do vetor se encontra o produto especificado ou imprima que o mesmo
não foi encontrado;
d) No método Loja.main(), após a impressão do vetor (feita na questão anterior, escolha um dos
5 produtos e crie duas novas instâncias idênticas a ele: uma com o mesmo código de barras e
outra com o código diferente*/