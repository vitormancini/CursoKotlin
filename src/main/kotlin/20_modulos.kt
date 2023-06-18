fun main() {
    var camiseta = Camiseta("Camiseta")
    camiseta.exibir()
}

internal class Precificacao(val quantidade: Int, val preco: Double) {}

open class Produto(val nome: String) {
    private lateinit var precificacao: Precificacao

    fun exibir() {
        println("Este produto é $nome e tem preco igual a ${precificacao.preco}")
    }

    fun precificar(quantidade: Int, preco: Double) {
        precificacao = Precificacao(quantidade, preco)
    }
}

class Camiseta(nome: String) : Produto(nome) {
    init {
        precificar(10, 99.00)
    }
}