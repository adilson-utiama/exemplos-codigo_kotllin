package funcoes

//HIGUER ORDER FUNCTIONS
//Funcoes que recebme outras funcoes como parametro

fun filtrar(lista: List<Int>, filtro: (Int) -> (Boolean)): List<Int> {
    val novaLista = arrayListOf<Int>()
    for(item in lista){
        if(filtro(item)){
            novaLista.add(item)
        }
    }
    return novaLista
}

fun numerosPares(numero: Int) = numero % 2 == 0

fun numerosMaioresQue3(numero: Int) = numero > 3


//Testes
fun main(args: Array<String>) {

    val ints = listOf(1,2,3,4,5)
    println(ints)

    var lista = filtrar(ints, ::numerosPares)
    println(lista)

    lista = filtrar(ints, ::numerosMaioresQue3)
    println(lista)


    //Com lambdas, podemos fazer a chamada entre chaves {}
    lista = filtrar(ints, { numero:Int -> numerosPares(numero)})
    println(lista)

    //Usando lambdas, sempre que a funcao recebe apenas um parametro, podemos usar o parametro "it" generico da linguagem
    lista = filtrar(ints, { numerosPares(it)})
    println(lista)


    //passando funcoes anonimas como parametro
    lista = filtrar(ints, { it % 2 == 0})
    println(lista)

    lista = filtrar(ints, { it > 3 })
    println(lista)


}