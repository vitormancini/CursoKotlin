fun main() {
    // Comparando classes normais
    var u1 = Class("Vitor", true)
    var u2 = Class("Vitor", true)

    println(u1 == u2)

    // Comparando data class
    var user1 = DataClass("Vitor", true)
    var user2 = DataClass("Vitor", true)

    println(user1 == user2)
}

// Classe normal
class Class(val name: String, val isAdmin: Boolean) {}

// Data class
data class DataClass(val name: String, val isAdmin: Boolean) {}
