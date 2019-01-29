package moreFunctons

import java.math.BigDecimal

//Generics
fun <T> doSomething(value: T) {
    when(value) {
        is String -> { println("O valoe é uma String") }
        is Int -> { println("O valor é um Int") }
        else -> {
            println("Valor nao identiifcado....")
        }
    }



}


fun main(args: Array<String>) {

    doSomething("String")

    doSomething(150)

    doSomething(BigDecimal.valueOf(15.0))
}