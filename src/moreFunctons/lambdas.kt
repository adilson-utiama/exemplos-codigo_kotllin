package moreFunctons


//#
fun operator2(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}


fun main(args: Array<String>) {

    //Lambdas
    //Expressões lambda e funções anônimas são 'funcoes literais', isto é,
    // funções que não são declaradas,
    // mas transmitidas imediatamente como uma expressão.
    //Possuem um 'return' implicito

    //Exemplos de declaracao
    val lambda1 = { x: Int, y: Int ->  x + y }
    val lambda2: (x: Int, y: Int) -> Int = { x, y -> x + y }

    operator2(2, 5, lambda1)  //metodo que recebe uma funcao ( High Order Function )
    operator2(2, 5, lambda2)

    //Podemos declara-las diretamente como parametro
    //Neste caso, nao precisamos inferir o tipo, pois o Kotlin ja o identifica-o
    operator2(2, 5, { x, y -> x + y })

}
