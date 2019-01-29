package object_oriented

//Classes abstratas mantem ESTADO diferente da interface
//embora tenham um comportamento semelhante
abstract class Abs() {

    val value: Double = 10.0

    fun methodWithBody() {
        //Do something....
    }

    abstract fun abstractMethod()
}

interface InterfaceA {
    val valueA: String
        get() {
            return "Valor estatico da InterfaceA"
        }

    fun defaultMethod() {
        println("Interface A")
    }

    fun abstractMethod()
}

interface InterfaceB {
    val valueB: String
        get() {
            return "Valor estatico da InterfaceA"
        }

    fun defaultMethod() {
        println("Interface A")
    }

}

class ImplementaInterface() : InterfaceA, InterfaceB {
    override fun defaultMethod() {
        //Podemos definir qual Interface ira proceder o metodo
        super<InterfaceA>.defaultMethod()
    }

    override fun abstractMethod() {
        println("Metodo Abstrato....")
    }

}


fun main(args: Array<String>) {

    val a: ImplementaInterface = ImplementaInterface()

    a.defaultMethod()

    a.abstractMethod()

    println(a.valueA)
    println(a.valueB)

}
