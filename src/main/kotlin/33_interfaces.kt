fun main() {
    var instrument = Drum()
    instrument.Play()
}

// UMA INTERFACE É UM MODELO DE CONTRATO QUE AS CLASSES QUE A IMPLEMENTAM DEVEM SEGUIR
interface Instrument {
    fun Play()
}

class Drum: Instrument {
    override fun Play() {
        println("A bateria está tocando")
    }
}