fun main() {

    // Instanciando um objeto e enviando apenas name
    var user1 = User("Vitor")

    println("Name: ${user1.name}")
    println("isAdmin: ${user1.isAdmin}")

    // Instanciando um objeto e não enviando parâmetros
    var user2 = User()

    println("\nName: ${user2.name}")
    println("isAdmin: ${user2.isAdmin}")
}

class User(var name: String, var isAdmin: Boolean) {

    // Podemos chamar um segundo construtor que pode recebe apenas name e, após receber, chama o construtor principal enviando um valor para a opção isAdmin
    constructor(name: String) : this(name, false) {}

    // Construtor sem parâmetros
    constructor() : this("Visitante", false) {}
}
