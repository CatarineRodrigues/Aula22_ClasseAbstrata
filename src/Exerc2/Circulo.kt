package Exerc2

class Circulo(var raio:Float) : Forma() {

    override fun calcularArea(): Float {
        println("O tamanho da área do Circulo de raio $raio é:")
        return (Math.PI*raio*raio).toFloat()
    }

    override fun calcularPerimetro(): Float {
        println("O tamanho do perímetro do Circulo de raio $raio é:")
        return ((2*Math.PI*raio).toFloat())
    }
}