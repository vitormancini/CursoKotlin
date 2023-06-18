fun main() {
    var musician = Musician()
    musician.desc()

    var guitar = Musician.Guitar()
    guitar.desc()

    var drummer = musician.Drum()
    drummer.desc()
}

class Musician {
    var style = "Rock"
    fun desc() {
        println("Meu estilo musical é $style")
    }

    class Guitar {
        fun desc() {
            println("Estou tocando guitarra")
        }
    }

    // INNER CLASS
    inner class Drum {
        fun desc() {
            println("Estou tocando bateria")
        }
    }
}