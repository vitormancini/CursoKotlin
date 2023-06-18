fun main() {
    var user = UserDatabase()
    user.Login("Vitor", "12345")

    println("Usuário logado no database: ${Database.name}")

    var user2 = UserDatabase()
    user2.Login("Lucas", "34256")

    println("Usuário logado no database: ${Database.name}")
}

// PARA CLASSES SINGLETON NÃO USAMOS A DECLARATIVA CLASS, MAS SIM OBJECT
object Database {
    var name: String? = null
    var password: String? = null
}

class UserDatabase() {
    fun Login(name: String, password: String) {
        Database.name = name
        Database.password = password
    }
}