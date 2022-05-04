package Exerc2

class Quadrado(lado: Float, altura: Float) : Retangulo(lado, altura) {

    override fun calcularArea(): Float {
        println("O tamanho da área do Quadrado de lado $lado e altura $altura é:")
        return lado*altura
    }

    override fun calcularPerimetro(): Float {
        println("O tamanho do perímetro do Quadrado de lado $lado e altura $altura é:")
        return 2*(lado+altura)
    }

}