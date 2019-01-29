package object_oriented


class Car(model: String, power: Float, maxSpeed: Int) {

    var model: String = model
    var power: Float = power
    var maxSpeed: Int = maxSpeed

    override fun toString(): String {
        return "Model: $model, Power: $power, Max Speed: $maxSpeed Km/h"
    }

}

class Person(var nome: String, var idade: Int) {

    init {
        println("Criando objeto Person")
    }

    //getter and set
    var specie: String = "Human"
        get
        private set

    override fun toString(): String {
        return "Nome: $nome - Idade: $idade"
    }

}

//Implicity implements toString, hashCode and equals
data class Product(val name: String, val price: Double)


fun main(args: Array<String>) {

    val car = Car("Camaro", 4.9f, 290)
    println(car)

    val person = Person("Wilson", 40)
    person.specie
    println(person)

    val p1 = Product("Smartphone", 1.000)
    val p2 = Product("Smartphone", 1.000)
    var p3 = p1

    println(p1)
    println(p1.equals(p2))
    println(p3.equals(p1))

    var p4 = p1.copy()
    println(p4.equals(p2))
}