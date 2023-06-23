import java.io.FileWriter
import java.io.IOException

fun main() {
    var usuario = UsuarioSistema("Vítor Mancini")
    usuario.criarPublicacao()
}

interface Logger {
    fun escreverLog(mensagem: String)
}

class UsuarioSistema(val nome: String): Logger {
    init {
        escreverLog("Usuário $nome criado!")
    }
    override fun escreverLog(mensagem: String) {
        // ESCRITA EM ARQUIVO
        try {
            var arquivo = FileWriter("arquivo.txt")
            arquivo.write(mensagem)
            arquivo.write("\n")
            arquivo.close()
        } catch(e: IOException) {
            println(e.message)
        }
    }
    fun criarPublicacao() {
        escreverLog("Usuário $nome criou uma publicação!")
    }
}