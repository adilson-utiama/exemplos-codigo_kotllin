package tipos

//Colecoes, semelhante a forma implementada no Java 8
//Porem no kotlin ha funcoes nativas para processar listas IMUTAVEIS e MUTAVEIS
//Exemplos a seguir
fun main(args: Array<String>) {

    //Lista IMUTAVEL de Int
    //ou seja NAO pode ser alterada
    val listaNumeros = listOf<Int>(1, 2, 3, 4, 5)
    //foreach -> percorre cada elemento da lista
    listaNumeros.forEach({
        n -> print(n)
    })

    //Lista MUTAVEL de String
    //ou seja PODE ser alterada
    var nomes = mutableListOf<String>("Ricardo", "Marcela", "Jose")
    nomes.add("Wilson") // Adicionando valores na lista

    //map -> percorre toda a lista e executa o metodo toUpperCase
    //o 'it' corresponde ao elemento na iteracao
    //nao altera a lista original
    val nomesMaiuscula = nomes.map { it.toUpperCase() }
    println(nomesMaiuscula) //[RICARDO, MARCELA, JOSE, WILSON]


    var numeros = listOf<Int>(1, 2, 3, 4, 5, 6, 7)
    // filter -> itera os elementos, dada uma condicao, se verdadeiro
    //separa esse valor em uma outra lista
    val pares = numeros.filter { it % 2 == 0 }
    println(pares) // [2, 4, 6]


    //Set IMUTAVEL de String
    //Nao aceita elementos repetidos
    var letras = setOf<String>("A", "B", "C", "D", "A")
    letras.forEach({ n -> print(n) }) // ABCD


    //Set MUTAVEL de Int
    //Nao aceita elementos repetidos
    var nums = mutableSetOf<Int>(10, 20, 30, 40, 50)
    nums.add(60)
    nums.add(10)
    println(nums) //[10, 20, 30, 40, 50, 60]


    //Map IMUTAVEL
    var mapa = hashMapOf<Int, String>(1 to "Item 1", 2 to "Item 2", 3 to "Item 3")
    var valorItem1 = mapa.get(1)
    println(valorItem1)

    //Map MUTAVEL
    var mapaLetras = mutableMapOf<Int, String>(1 to "A", 2 to "B")
    mapaLetras.put(3, "C")
    println(mapaLetras) //{1=A, 2=B, 3=C}


}
