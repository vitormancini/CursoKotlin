fun main() {
    // Instanciando a classe Veiculo e passando os valores para o construtor
    var carro = Veiculo("Uno", "Fiat", 2000)
}

// Inicializamos uma classe com valores determinados através do construtor

class Veiculo (modelo: String, marca: String, ano: Int) {
    var modelo = modelo
    var marca = marca
    var ano = ano
}