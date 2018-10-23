//EXTENSIONS
//Basicamente permitem adicionar metodos em classes sem usar heranca


//extendendo a classe String
fun String.ascii(): String {
    var s = ""
    for(c in this){
        s += c.toInt()
    }
    return s
}

//extendendo a classe Int
fun Int.somaEMultiplicacao(x: Int, y: Int): Int {
    return (x + y) * this;
}


//Outro Exemplo
class Pessoa(nome: String){

    var nome: String = nome
        get() = field
        set(value){
            field = value
        }

    fun nomeCompleto(sobrenome: String): String {
        return "Nome Completo: $nome $sobrenome"
    }
}

fun Pessoa.imc(altura: Double, peso: Double): String {
    val imc = peso / (altura * altura)
    return "IMC: $imc"
}



fun main(args: Array<String>) {

    var numero = 2;
    //utilizando metodo extendido na classe Int
    var somaEMultiplicacao = numero.somaEMultiplicacao(4, 3)
    println(somaEMultiplicacao) // 14 ->  (4 + 3) x 2 = 14


    val nome = "Ricardo"
    //utilizando metodo extendido na classe String
    var ascii = nome.ascii()
    println(ascii)  // 821059997114100111


    var pessoa = Pessoa("Wilson")
    var nomeCompleto = pessoa.nomeCompleto("Silva")
    println(nomeCompleto)
    //metodo extendido da classe Pessoa
    var imc = pessoa.imc(1.69, 70.0)
    println(imc)
}