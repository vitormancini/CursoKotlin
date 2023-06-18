fun main() {
    val userA = User17("Vitor", false)

    // Desestruturando
    val(name, isAdmin) = userA

    println(name)
    println(isAdmin)

    // COPIANDO UM OBJETO
    var userB = userA.copy()

    // COPIANDO UM OBJETO E ALTERANDO UM PROPRIEDADE
    var userC = userA.copy(isAdmin = true)
}

data class User17(val name: String, val isAdmin: Boolean) {}