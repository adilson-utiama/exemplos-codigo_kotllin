package classes

//Exemplo de definicao de classe
//Construtor com argumentos na mesma linha
//Uma classe para ser extendivel, precisa ter a declaracao 'open' antes de 'class'
open class Automovel(nome: String, ano: Int){ //<- construtor
    val nome:String  //<- propriedades
    val ano:Int

    init{  //<- inicia propriedades
        this.nome = nome
        this.ano = ano
    }

    //Para que a funcao possa ser sobreescrita pela classe filha
    //necessario declarar como 'open'
    open fun acelerar(velocidade: Int) {
        println("Acelerando este automovel a $velocidade Km/h")
    }

    override fun toString(): String {  //<- toString sobreescrita
        return "Nome $nome - Ano $ano"
    }
}

//Exemplo de Heranca
//Utiliza-se a sintaxe dos dois-pontos, seguido do nome da classe
class CarroLuxo(nome: String, ano:Int,acessorios: String): Automovel(nome, ano) {

    //Exemplo de GET e SET
    var acessorios: String = acessorios
        get() = field
        set(value) {
           field = value
        }

    //metodo sobreescrito da classe MAE
    override fun acelerar(velocidade: Int) {
        println("Acelerando com carro de luxo a $velocidade Km/h")
    }

    override fun toString(): String {
        return "Nome: $nome, Ano: $ano, Acessorios: $acessorios"
    }
}


//Exemplo de DATA CLASSES
//Implementam copy(), equals(), hashCode() e toString() automaticamete
//Usa-se a palavra 'data' para defini-lo
//Destina-se a classee que apenas guardam informacoes (Java Bean)
data class Objeto(var nome:String)



//Exemplo COMPANION OBJECTS
//Sao objetos SINGLETON dentro de uma classe
//sendo acessiveis sem instanciar a classe em si
class BancoService{

    companion object {
        fun getConexao() {
            println("Conectando ao banco de dados...")
        }
    }

}


//Exemplo SINGLETON
//Apenas utilizar a palavra 'object' no lugar de 'class'
//Nao possui construtor
object SingleTon{

    fun mostraMensagem(msg: String){
        println("Objeto Singleton msg : $msg")
    }
}


fun main(args: Array<String>) {

    //Em Kotlin, nao ha necessidade da palavra 'new' para instanciar objetos
    val carroLuxo = CarroLuxo("Ferrari", 2017, "Bancos de couro legitimo")

    //Recuperando valor de acessorios(GET)
    val acessoriosDoCarro = carroLuxo.acessorios

    println("Acessorios -> $acessoriosDoCarro")

    //Reatribuindo valor de acessorios (SET)
    carroLuxo.acessorios = "Ar condicionado de Luxo"

    println(carroLuxo)

    println(carroLuxo.acelerar(150))

    //Objetos Data Classes
    val objeto1 = Objeto("Um objeto")
    val objeto2 = Objeto("Outro objeto")
    println(objeto1.equals(objeto2)) //false
    val nome = objeto1.nome // GET
    println(nome) // Um Objeto
    objeto1.nome = "Objeto alterado" // SET
    println(objeto1.toString()) // Objeto(nome=Objeto alterado)


    //Uso do Singleton
    SingleTon.mostraMensagem("Alguma coisa")


    //Companion object
    //Acessando objeto SINGLETON de uma classe comum
    BancoService.getConexao()
}