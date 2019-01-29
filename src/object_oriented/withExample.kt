package object_oriented

class WithTest() {

    fun method1() {
        println("Metodo 1")
    }

    fun method2() {
        println("Metodo 2")
    }

    fun method3() {
        println("Metodo 3")
    }
}


fun main(args: Array<String>) {

    val test = WithTest()
    test.method1()
    test.method2()
    test.method3()

    //equivalente ao codigo de cima
    with (test) {
        method1()
        method2()
        method3()
    }
}
