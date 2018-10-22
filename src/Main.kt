//Em Kotlin não é obrigatorio o uso ';' no final da linha do codigo
//Exceto quanto colocamos na mesma linha, outras linhas
//println(frase); print(frase)

//Declaracao do Metodo Main
fun main(args: Array<String>) {

    //variaveis declarados com 'val' não podem ser reatribuidos valores, portanto IMUTAVEIS
    val nome = "Wilson"
    //nome = "outro nome" >> Erro: valor não pode ser reatribuido

    //Variaveis declarados com 'var' podem ser reatribuido valores, portanto MUTAVEL
    var frase = "Meu nome é $nome"

    //Definindo um tipo para variavel,
    // caso nao seja definido o tipo sera referente ao valor recebido
    var variavel = "Silva" // >> tipo String
    var variavelInt = 123 // >> tipo Int
    //variavelInt = "numeros" >> Erro: Type Mismatch

    //Podemos definir o tipo com a sintaxe seguinte
    // ':' e o tipo apos nome da variavel
    var variavelString: String
    variavelString = "Uma String"

    //Com o tipo Any, podemos reatribuir valores Dinamicos
    //ou seja qualquer tipo
    var variavelAny: Any
    variavelAny = 123
    variavelAny = "String"

    minhaFuncao(frase) //"Meu nome é Wilson"

    //Exemplo de uso de STRING TEMPLATE
    frase = "My name is $nome" // >> Concatenacao de String com '$' seguido da variavel

    //Funcoes printar valores , semelhante ao System.out.println() do Java
    println(frase) //"My name is Wilson"

    //exemplo de uso funcoes
    var soma = soma(4, 2)
    print(soma)
}


//FUNCOES (METODOS)
//Declaracao de uma funcao
// [ fun NOME_FUNCAO (): RETORNO {} ]

fun minhaFuncao(arg: String){
    println(arg)
}

fun soma(x: Int, y: Int): Int{
    return x + y
}