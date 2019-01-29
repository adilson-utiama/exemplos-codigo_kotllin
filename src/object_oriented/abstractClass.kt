package object_oriented

abstract class Animal(val name: String) {

    fun sayAnything() {
        println("My name is $name")
    }

    open fun methodOveride() {
        println("Method override")
    }

    abstract fun abstractMethod()
}

class Mamal(name: String, var age: Int) : Animal(name) {

    override fun abstractMethod() {
        println("Executando metodo abstrato....")
    }

    override fun methodOveride() {
        super.methodOveride()
        println("Age: $age")
    }

    //Overload
    fun methodOverride(age: Int) {
        println("Overload - Age: $age")
    }
}


fun main(args: Array<String>) {

    val p1 = Mamal("Tiger", 45)
    p1.sayAnything()

    p1.methodOveride()
    p1.methodOverride(12365)

    p1.abstractMethod()
}