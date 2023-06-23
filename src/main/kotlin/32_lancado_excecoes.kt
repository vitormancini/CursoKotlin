import kotlin.IllegalArgumentException

fun main() {
    try {
        val res = applyDiscount(100.00, 70)
        println(res)
    } catch(e: IllegalArgumentException) {
        println(e.message)
    }
}

fun applyDiscount(price: Double, value: Int): Double {
    // NÃO PERMITIR DESCONTO ACIMA DE 50
    if (value > 50) {
        throw  IllegalArgumentException("Desconto não pode ser maior que 50")
    }
    val discount = value * price / 100
    return price - discount
}