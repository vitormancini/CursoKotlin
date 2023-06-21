fun main() {
    // CHAVE / VALOR
    val product = mapOf(
        "Android" to "Google",
        "IOS" to "Apple",
        "Windows" to "Microsoft"
    )

    println(product["Android"]) // CASO UMA CHAVE INEXISTENTE É PASSADA, O VALOR NULL SERÁ RETORNADO

    // PODEMOS DEFINIR UM VALOR PADRÃO PARA UMA CHAVE NÃO EXISTENTE
    println(product.getOrDefault("IOS2", "Inexistente"))

    // CASO NÃO EXISTA A CHAVE, EXECUTA UM BLOCO DE CÓDIGO
    product.getOrElse("Android2", {
        println("Eexcutando um bloco de código por não ter encontrado a chave")
    })

    // VERIFICA SE CHAVE EXISTE (RETORNA BOOLEANO)
    product.containsKey("Windows")

    // VERIFICA SE VLAOR EXISTE (RETORNA BOOLEANO)
    product.containsValue("Apple")

    // EXIBE TODAS AS CHAVES E VALORES DO MAP
    product.keys
    product.values

    // REMOVENDO UM ELEMENTO PELA CHAVE (PRECISA SER UM MUTABLE MAP)
    // product.remove("IOS")

    // LIMPAR A LISTA
    // product.clear()
}