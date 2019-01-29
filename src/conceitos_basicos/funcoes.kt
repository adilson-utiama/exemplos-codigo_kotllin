package conceitos_basicos

fun add(a:Int) =  a + 10

fun funcaoMultiplica(numero:Int, multiplicador:Int = 2):Int { return numero * multiplicador }


fun funcaoDivide(a:Double, b:Int = 2):Double {
    return a / b
}

fun main(args: Array<String>) {
    var n = add(10)
    println(n)


    var n1 = funcaoMultiplica(4)
    println(n1)

    var n2 = funcaoMultiplica(4, 8)
    println(n2)

    var n3 = funcaoDivide(5.5, 3)
    println(n3)

}