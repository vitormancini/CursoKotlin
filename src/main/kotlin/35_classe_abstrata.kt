fun main() {
    val texto = Text("Boas Vindas", 10 to 10)
    texto.render()
    println(texto.position())
}

abstract class Component {
    abstract fun position() : Pair<Int, Int>
    open fun render() {
        println("Desenhando a tela...")
    }
}

class Text(val text: String, val pos: Pair<Int, Int>): Component() {
    override fun render() {
        super.render()
        println("Desenhando o text $text na tela")
    }

    override fun position(): Pair<Int, Int> {
        return pos
    }
}