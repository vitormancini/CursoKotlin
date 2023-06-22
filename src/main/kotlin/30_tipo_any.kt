fun main() {
    // O TIPO ANY É O TIPO GENÉRICO DE DADO
    // TODOS OS DEMAIS TIPOS HERDAM DE ANY
    val booleano: Boolean = true
    val numerico: Int = 10
    val texto: String = "texto"

    println(booleano::class)
    println(numerico::class)
    println(texto::class)

    val obj = getObject(3)
    if(obj is Int) println("Retornou um inteiro")
    else if(obj is String)  println("Retornou uma string")
    else if(obj is Boolean) println("Retornou uma booleano")
    else println("Retornou um decimal")

    // TENTANDO CONVERTER UM TIPO ANY EM STRING (CASO NÃO CONSIGA RETORNA NULL)
    val ret: Any = true
    val cast = ret as? String
    println(cast)
}

// COM UMA ÚNICA FUNÇÃO PODEMOS RETORNAR QUALQUER TIPO DE DADO USANDO O ANY
fun getObject(value: Int): Any {
    return when(value) {
        1 -> 1
        2 -> "texto"
        3 -> true
        else -> 1.5
    }
}