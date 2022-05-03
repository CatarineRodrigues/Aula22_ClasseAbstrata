package Exerc1

class Livros(
    var nome: String,
    var preço: Double,
    var codigoBarras: Int,
    var autor: String
) : Produtos(nome, preço, codigoBarras) {

    override fun mostrarDetalhesDoItem() {
        println("Nome: $nome, Preço: $preço, Código de barras: $codigoBarras, pessoa autora do livro: $autor ")
    }

}