package conceitos_basicos

class Person() {

    fun speak() {
        println("Speaking...")
    }
}

fun main(args: Array<String>) {

    fun String.firstLetter(str: String): String {
        return str.get(0).toString()
    }

    var person: Person = Person()

    fun Person.walk() {
        println("Walking...")
    }

    fun Person.firstLetter(value: String): String {
        return value.firstLetter(value)
    }


    person.walk()

    var a = person.firstLetter("Nome")

    print(a)




}