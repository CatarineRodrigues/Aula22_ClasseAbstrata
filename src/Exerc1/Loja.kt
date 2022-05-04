package Exerc1

import kotlin.system.exitProcess

fun main() {
    val listaProdutos: ArrayList<Produtos> = ArrayList()

    val livroHistoria = Livros("Jogos Vorazes", 25.90, 7894560, "Suzane Collins")
    val cdMusica = CDs("Marron 5", 22.90, 123456, 10)
    val dvdFilme = DVDs("Avengers: End Game", 79.90, 4569632, 182)

    listaProdutos.add(livroHistoria)
    listaProdutos.add(cdMusica)
    listaProdutos.add(dvdFilme)

    listaProdutos.forEach {
        it.mostrarDetalhesDoItem()
    }



}