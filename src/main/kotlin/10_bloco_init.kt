fun main() {
    var myClass = MyClass()
}

class MyClass(name: String, age: Int) {

    // O bloco init é executado antes dos construtores
    init {
        println("Executando o bloco init...")
    }

    constructor() : this("Visitante", 0) {
        println("Executando o construtor secundário...")
    }
}