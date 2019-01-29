package examples

fun manyParameters(vararg numbers: Int) {
    numbers.forEach { n -> print(n) }
}

fun <T> manyGenericParameters(vararg anything: T) {
    anything.forEach { v -> print(v) }
}

fun main(args: Array<String>) {
    manyParameters(1,2,3,45,6,9)

    manyGenericParameters(1,2,3,"Numero", 10f, "Alguma Coisa")
}