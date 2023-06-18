fun main() {
    var guitarra = Guitarra("Guitarra")
    guitarra.afinar()

    var bateria = Bateria("Bateria")
    bateria.afinar()
}

abstract class Instrumento(var nome: String) {

    // UM MÉTODO ABSTRATO PERMITE SER SOBREESCRITO PELAS CLASSES FILHAS
    abstract fun afinar()
}

class Guitarra(nome: String) : Instrumento(nome) {

    // SOBREESCREVENDO O MÉTODO ABSTRATO DA CLASSE MÃE
    override fun afinar() {
        println("Guitarra afinada com sucesso!")
    }
}

class Bateria(nome: String) : Instrumento(nome) {
    override fun afinar() {
        println("Bateria afinada com sucesso!")
    }
}