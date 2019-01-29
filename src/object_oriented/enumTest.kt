package object_oriented

enum class Priority(val id: Int) {

    LOW(1) {
        override fun toString(): String {
            return "LOW value"
        }
    }, MEDIUM(2), HIGH(3), CRITICAL(4);

    override fun toString(): String {
        return "$name é da posicao $ordinal"
    }

    fun test() {
        println("Testando $name")
    }

}

fun main(args: Array<String>) {

    for(value in Priority.values()) {
        if(value.equals(Priority.LOW)) {
            println(value)
        } else if(value.equals(Priority.CRITICAL)) {
            println("Critical Value")
        } else {
            println(value)
            value.test()
        }
    }

}

