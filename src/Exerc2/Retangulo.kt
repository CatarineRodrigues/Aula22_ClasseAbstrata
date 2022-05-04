package Exerc2

open class Retangulo(var lado: Float, var altura: Float): Forma() {

    override fun calcularArea(): Float {
        println("O tamanho da área do Retângulo de lado $lado e altura $altura é:")
        return lado*altura
    }

    override fun calcularPerimetro(): Float {
        println("O tamanho do perímetro do Retângulo de lado $lado e altura $altura é:")
        return 2*(lado+altura)
    }
}