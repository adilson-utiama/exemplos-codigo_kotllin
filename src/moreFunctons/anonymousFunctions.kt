package moreFunctons

fun operator3(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun main(args: Array<String>) {


    //Funcoes Anonimas
    //basicamente uma funcao sem nome
    //comportamento igual a uma funcao normal

    operator3(2, 5, fun(x: Int, y: Int): Int {
        //Regra de negocio aqui....
        return x + y
    })

}