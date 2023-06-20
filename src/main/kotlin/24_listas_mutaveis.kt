fun main() {
    var listaUsuarios = mutableListOf<User24>(User24("Vitor", false), User24("Lucas", true))

    var maria = User24("Maria", true)

    listaUsuarios.add(maria)

    listaUsuarios.forEach { println(it.name) }

    // EXCLUSÃO POR USUARIO
    listaUsuarios.remove(maria)

    // EXCLUSÃO POR ÍNDICE
    listaUsuarios.removeAt(0)

    listaUsuarios.forEach { println(it.name) }

    // COMBINAÇÃO DE LISTAS
    var listaA = mutableListOf("Vitor", "Lucas", "Maria")
    var listaB = mutableListOf("Joao", "Lucy", "Peter")

    listaB.filterTo(listaA, { it.contains("a") })
    println(listaA)

    // LISTA DE LISTAS
    var listaC = listOf("A", "B")
    var listaD = listOf("C", "D")
    var listaTotal = listOf(listaC, listaD) // O REUSLTADO É UMA LISTA DE LISTA = [[A,B],[C,D]]
    println(listaTotal.flatten()) // TRANSFORMANDO EM UMA ÚNICA LISTA

    // FILTRANDO UMA LISTA
    var listaPura = listOf<User24>(
        User24("Vitor", true),
        User24("Lucas", false),
        User24("Maria", false)
    )

    var adms = listaPura.filter { it.isAdmin == true }
    println(adms)
}

class User24(var name: String, var isAdmin: Boolean) {}
