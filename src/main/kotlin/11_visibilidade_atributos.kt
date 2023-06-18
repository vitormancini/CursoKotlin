fun main() {
    var myClass1 = MyClass11()
    var myClass2 = MyClass11()
    var myClass3 = MyClass11()

    println("COUNT: ${MyClass11.count}")
}

class MyClass11() {
    // ATRIBUTO PODE SER ACESSADO APENAS DENTRO DA CLASSE
    private val MAX_LENGTH = 10

    // PROPRIEDADES DA CLASSE (COMPARTILHADAS ENTRE TODOS OS OBJETOS QUE A INSTANCIARAM)
    companion object {
        var count = 0
    }

    init {
        count++
    }
}