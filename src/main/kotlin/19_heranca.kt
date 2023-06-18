fun main() {
    var professor = Professor("Vitor", "vitor@hotmail.com")
    println(professor.description())

    var cleaner = Cleaner("John", "john@yahoo.com")
    println(cleaner.description())
}

// CLASSE MÃE (SUPER)
open class Employee(var name: String, var email: String) {
    protected var libraryAccess = false
    fun description() = "Eu sou um funcionário. \nNome: $name \nEmail: $email \nAcesso a biblioteca: $libraryAccess"
}

// CLASSE QUE HERDA DE Employee
class Professor(name: String, email: String) : Employee(name, email) {
    // ALTERANDO A PROPRIEDADE SOMENTE PARA A CLASSE
    init {
        libraryAccess = true
    }
}

// MAIS UMA CLASSE FILHA
class Cleaner(name: String, email: String) : Employee(name, email) {

}