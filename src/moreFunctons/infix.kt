package moreFunctons

class Person(val name: String) {

    //utilizando a keyword infix
    infix fun isName(str: String): Boolean {
        return name == str
    }
}

//funções marcadas com a palavra-chave infix também podem ser chamadas usando a notação infix
// (omitindo o ponto e os parênteses para a chamada).
// As funções de infixação devem satisfazer os seguintes requisitos:
// -  Precisam receber apenas 1 parametro e nao ter valor 'default'
// - Eles devem ser funções de membro ou 'extension functions'
infix fun Int.isHalfOf(value: Int) = value / 2 == this

fun main(args: Array<String>) {

    val p = Person("Wilson")
    p.isName("Wilson") //chamada normal da funcao
    p isName "Wilson" //chamada usando a notacao do 'infix' - sem ponto e parenteses

    10.isHalfOf(20) //sem infix
    10 isHalfOf 20 //com infix

}