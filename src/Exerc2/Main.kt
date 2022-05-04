package Exerc2


fun main() {

    val circulo = Circulo(15f)
    val retangulo = Retangulo(3f, 10f)
    val retangulo2 = Retangulo(15f, 20f)
    val quadrado = Quadrado(10f, 10f)
    val quadrado2 = Quadrado(5f, 5f)

    val listaFormas: ArrayList<Forma> = ArrayList()

    listaFormas.add(circulo)
    listaFormas.add(retangulo)
    listaFormas.add(retangulo2)
    listaFormas.add(quadrado)
    listaFormas.add(quadrado2)

    listaFormas.forEach {
        println(it.calcularArea())
        println(it.calcularPerimetro())
        println()
    }
}