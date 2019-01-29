package conceitos_basicos

fun testando() {
    for (x in  2..5){
        print(x)
    }
    return
}

fun testandoFor() {
    for(x in 100 downTo 1 step 10) {
        print(x.toString() + " ")
    }
}

fun invertendoString(palavra: String):String {
    var inverso: String = ""
    for(letra in palavra.length - 1 downTo 0){
        inverso = inverso.plus(palavra.get(letra))
    }
    return inverso
}

fun main(args: Array<String>) {

    testando()

    testandoFor()

    var string = invertendoString("palavra inversa")
    println(string)
}

