package classes

//Definicao de interface
//Semelhante a forma do JAva 8
interface MinhaInterface {

    val prop: Int //propriedade abstrata

    fun fazAlgo() //metodo abstrato

    fun fazOutraCoisa(){  //metodo semelhante ao DEFAULT do Java8, possui corpo
        println("Fazendo outra coisa")
    }

}

//Interface extendendo outra Interface
interface OutraInterface : MinhaInterface {

    fun mostrandoMsg(msg: String)
}


class Implementacao : OutraInterface {

    //Metodo de OutraInterface
    override fun mostrandoMsg(msg: String) {
        println(msg)
    }

    //Sobreescrevendo propriedade abstrata de MinhaInterface
    override val prop: Int = 30

    //Sobreescrevendo metodo abstrato e implementacao de MinhaInterface
    override fun fazAlgo() {
        println("Metodo sobreescrito.")
    }

}

fun main(args: Array<String>) {

    var implementacao = Implementacao()
    implementacao.fazAlgo() //metodo implementado
    implementacao.fazOutraCoisa() // metodo da interface com corpo
    var prop = implementacao.prop
    println(prop) // 30

    implementacao.mostrandoMsg("Minha msg")
}