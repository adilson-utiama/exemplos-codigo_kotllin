package funcoes

class Funcoes {

    //Sintaxe fun nomeFuncao([parametro]: [Tipo]): [Retorno] { ... }

    fun soma(numero1: Int, numero2: Int): Int {
        return numero1 + numero2;
    }

    fun printSoma(num1: Int, num2: Int): String {
        return "A soma de ${num1} e ${num2} é igual a ${num1 + num2}";
    }

    fun maxOf(a: Int, b: Int) = if (a > b) a else b

    //SINGLE EXPRESSION FUNCTIONS:
    //Sempre que uma função tiver apenas uma linha, não será preciso abrir e fechar chaves,
    //basta usar o operador de = tudo em uma única linha
    //o tipo de retorno pode ser omitido
    fun imprimir(s: String) = println(s)
    fun somar(a: Int, b: Int) = a + b


    //DEFAULT ARGUMENTS
    //valores padroes
    fun getInteiros(s: String?, defaultvalue: Int = 0): Int{
        if(s != null){
            return s.toInt()
        }
        return defaultvalue
    }

    //NAMED ARGUMENTS
    //util em funcoes com muitos argumentos
    //Possibillidade de passagem de argumentos fora de ordem
    fun teste(nome: String?, sobrenome: String? = null, editora: String? = null){
        println("Nome: $nome, Sobrenome: $sobrenome, Editora: $editora")
    }
    //Exemplo
    //teste("Adilson", editora = "Novatec", sobrenome = "Utiama")


    //VARARGS
    //usando palavra reservada "vararg"
    //passagem de varios parametros
    fun toList(vararg args: String): List<String>{
        val lista = ArrayList<String>()
        for(s in args) lista.add(s)
        return lista
    }

    //Funcoes com Tipos Genericos
    fun <T> paraListaGenerica(vararg args: T): List<T>{
        val listaGenerica = ArrayList<T>()
        for (s in args) listaGenerica.add(s)
        return listaGenerica
    }


}


fun main(args: Array<String>) {
    var funcoes = Funcoes();

    //usando funcoes com named arguments
    funcoes.teste("Adilson", editora = "Novatec")

    //funcao com varargs
    val lista = funcoes.toList("Adilson", "Wilson", "Edson")
    println(lista)

    //funcao com tipo generico
    val listaGenerica = funcoes.paraListaGenerica<Int>(1, 25, 36)
    println(listaGenerica)
}