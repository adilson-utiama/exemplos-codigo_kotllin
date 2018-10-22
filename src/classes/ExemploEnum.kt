package classes

//Exemplo simples de ENUM
enum class Color(val rgb: Int) {

    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

fun main(args: Array<String>) {

    var rgb = Color.BLUE.rgb

    println(rgb) // 255
}
