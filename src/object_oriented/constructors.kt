package object_oriented

class PrivateClient private constructor(val value: String) {
    //static methods
    companion object {

        fun doSomething(value: String) {
            println("Fazendo.... $value")
        }
    }
}

class Client(val name: String) {

    //Second constructor calls primary constructor
    constructor(name: String, age: Int) : this(name)
}


fun main(args: Array<String>) {

    PrivateClient.doSomething("Algo")

    val c1 = Client("Nome")
    val c2 = Client("Nome", 40) //second constructor invoked
}
