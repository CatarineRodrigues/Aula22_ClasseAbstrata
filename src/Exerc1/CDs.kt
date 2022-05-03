package Exerc1

class CDs(
    var nome: String,
    var preço: Double,
    var codigoBarras: Int,
    var numeroFaixas: Int
) : Produtos(nome, preço, codigoBarras) {

    override fun mostrarDetalhesDoItem() {
        println("Nome: $nome, Preço: $preço, Código de barras: $codigoBarras, número de faixar do CD: $numeroFaixas ")
    }

}