package tipos

fun main(args: Array<String>) {

    //##### VARIAVEIS COM VAL E VAR

    //[tipoVariavel] [nome]:[Tipo] = [valor]

    val nome:Any = "Ricardo"
    //nome = "Adilson" //-> Não pode ser atribuido outro valor, equivalente ao Final do Java
    val numero:Int = 123

    var variavel:String = "O valor pode ser alterado"
    variavel = "Alterando variavel"

    //##### Conversão de Tipos (CAST) : as e is

    println(nome as String) //[ as ]faz um cast do tipo Any para String
    println(numero as? String) //[ as? ]  Caso nao consiga fazer o cast, retorna nulo
    //println(numero as String) //Lanca uma exception ClassCastException caso nao consiga fazer cast

    if(nome is String){  //[ is ] equivalente ao instanceof do Java
        println("$nome é uma String")
    }


    //##### Objetos Nulos (Null Safety)
    //Em Kotlin não é permitido que se atribua valor nulos em variaveis, a menos que seja explicitamente
    //indicado no codigo com '?' apos o tipo
    //Em Kotlin, mesmo se utilizando dessa forma, não corremos o risco de NullPointerException
    //pois o Kotlin sabe que o objeto é nulo e nao tenta acessa-lo

    var objeto:String = "Livro"
    //objeto = null  //=> Nao aceita

    var outroObjeto:String? = "Celular"  //=> Aceita nulo
    outroObjeto = null
    println(outroObjeto?.length) // null >> Nao ocorre uma excecao

    //Porem podemos forcar um objeto nulo com o uso de '!!'
    //Embora nao seja recomendado seu uso
    var objetoNulo:String? = null
    //println(objetoNulo!!.length) //Ocorre uma excecao


    //#####Operador Ternario
    //O operador ternario pode ser utilizado com o proprio if else

    fun parOuImpar(a: Int): String{
        return if(a % 2 == 0) "PAR" else "IMPAR"
    }

    //Operador Elvis [?:]

    fun enviarEmail(usuario: String, titulo: String? = null): String {
        val s = titulo?: "Bem Vindo"
        return "$s usuario"
    }


}
