fun main(args: Array<String>) {

    println("FOR LOOPS")
    println("##Listando Frutas")
    val frutas = listOf("apple", "banana", "kiwi")
    for (fruta in frutas) {
        println(fruta)
    }

    println("##Listando Alimentos")
    val alimentos = listOf("arroz", "feijao", "batata")
    for (index in alimentos.indices) {
        println("item at $index is ${alimentos[index]}")
    }

    println("WHILE LOOP")
    val items = listOf("apple", "banana", "kiwi")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }

    println("##EXPRESSAO WHEN")
    fun describe(obj: Any): String =
            when (obj) {
                1          -> "Numero"
                "Hello"    -> "String"
                is Long    -> "Long"
                !is String -> "Not a string"
                else       -> "Unknown"
            }
    println(describe(5))

    println("##USANDO RANGES")
    for (x in 1..5) {
        print(x)
    }
}