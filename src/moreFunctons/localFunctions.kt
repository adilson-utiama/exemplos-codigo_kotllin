package moreFunctons

import java.text.SimpleDateFormat
import java.util.*

fun top() {

    //NAO HA ACESSO
    //log("")

    //local function - funcao dentro de funcao
    //nao podem ser chamadas fora desta funcao
    //so e possivel chamar funcao apos sua declaracao
    fun log(str: String) {
        val calendar = Calendar.getInstance()
        val formatted = SimpleDateFormat("HH:mm:ss")
        println("$str - ${ formatted.format(calendar.time) }")
    }

    //chamando funcao interna
    log("Inicio")

    val interval = 1..1000000000
    var sum: Double = 0.0

    for(i in interval) {
        sum += i *2 * 1
    }

    log("Fim")

}

fun main(args: Array<String>) {

    top()

    //log("Nao Funciona")
    //top().log("Nao Funciona")
}
