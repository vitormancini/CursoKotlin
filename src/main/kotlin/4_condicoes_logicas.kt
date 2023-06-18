fun main() {
    var idade: Int = 19
    var acompanhado: Boolean = true

    if (idade >= 18) {
        print("Entrada liberada, você é maior de idade.")
    }
    else if (idade < 18 && acompanhado == true) {
        print("Entrada liberada, você é menor de idade mas está acompanhado.")
    }
    else {
        print("Entrada proibida. Você é menor de idade e não está acompanhdo.")
    }
}