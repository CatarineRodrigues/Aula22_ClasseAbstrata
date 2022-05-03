package Exerc1

class DVDs(
    var nome: String,
    var preço: Double,
    var codigoBarras: Int,
    var duraçao: Int
) : Produtos(nome, preço, codigoBarras) {

    override fun mostrarDetalhesDoItem() {
        println("Nome: $nome, Preço: $preço, Código de barras: $codigoBarras, duração do filme: $duraçao minutos ")
    }

}