package object_oriented

abstract class Test() {
    abstract fun doSomething()
}

class Math() {

    //possivel herdar classes
    //precisa ter um nome
    object CONSTANTS : Test() {
        val PI: Double = 2.1415
        override fun doSomething() {
            println("My value is $PI")
        }

        object OTHER_CONSTANTS {
            val A: String = "valor A"
        }
    }

    //atributos estaticos
    companion object {
        val PI: Double = 2.1415

        object MANY {
            val value1: Int = 50
            val value2: Int = 100
        }
    }

}

//Nao ha necessidade de estar dentro do escopo da classe
object OUTSIDER {

    val A: Int = 1
    val B: Int = 2
}


fun main(args: Array<String>) {

    Math.PI //companion object
    Math.CONSTANTS.PI //object
    Math.Companion.PI //companion object

    OUTSIDER.A //object fora de escopo

    Math.Companion.MANY.value1 //object dentro de companion object

    Math.CONSTANTS.OTHER_CONSTANTS.A //object dentro de object
}