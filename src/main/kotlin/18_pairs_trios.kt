fun main() {
    // PAIR É UM DATACLASS
    var coordinates = Pair(10, 20)
    println(coordinates.first)
    println(coordinates.second)

    val usuarioPeloId = 15 to "Vitor"
    println(usuarioPeloId.first)
    println(usuarioPeloId.second)

    // TRIO
    var trio = Triple(2, 4, 5)
    println(trio.first)
    println(trio.second)
    println(trio.third)
}