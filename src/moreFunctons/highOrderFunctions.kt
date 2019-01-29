package moreFunctons

//HighOrderFunction - passagem de funcoes como parametro

//declaracao 'op: (Int, Int) -> Int'  nome: (tipo, tipo) -> retorno
fun operator(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun sum(x: Int, y: Int) = x + y

fun multiply(x: Int, y: Int) = x * y

//Exemplo com uma extension function da classe Iterable
//Todas as classes que implementam Iterable passarao a ter o
// metodo que recebe uma funcao como parametro
fun <T> Iterable<T>.paraCada( op: (T) -> Unit ) {
    for(i in this) {
        op(i)
    }
}

fun main(args: Array<String>) {

    var somaResultado = operator(2, 5, ::sum) //para passar a funcao como parametrro deve-se usar '::' antes do nome da funcao
    println(somaResultado)

    var resultado = operator(2, 5, ::multiply)
    println(resultado)

    val list = listOf(1,2,3,4,5)
    list.forEach { println(it) } //acessivel devido a este objeto implementar Iterable

    var map = mapOf(Pair("Key", "Value"))
    map.values.paraCada { println(it) } //acessivel devido a este objeto implementar Iterable

}
