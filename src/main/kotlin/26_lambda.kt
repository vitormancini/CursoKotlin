fun main() {
    //LAMBDA
    calc(5, 3, { x, y ->
        x * y
    })

    // FUNÇÃO MAP (TRANSFORMANDO UMA LISTA DE USERS EM UMA LISTA DE STRINGS)
    val user1 = User26("Vitor", true)
    val user2 = User26("Lucas", false)
    val user3 = User26("Maria", false)

    var listaUsers= mutableListOf<User26>(user1, user2, user3)
    var listaUsersNames = listaUsers.map {user ->
            user.name
    }

    listaUsersNames.forEach {
        println(it)
    }
}

fun calc(x: Int, y: Int, operation: (Int, Int) -> Int) {
    val result = operation(x, y)
    println("Resultado da operação: $result")
}

class User26(val name: String, val isAdmin: Boolean) {
}

