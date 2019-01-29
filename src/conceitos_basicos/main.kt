package conceitos_basicos

class Pessoa(var nome:String, var sobrenome:String, var idade:Int) {

    fun mostrarDados(): String {
        return "Meu nome é ${nome} ${sobrenome} e minha idade é ${idade}"
    }
}


fun main(args: Array<String>) {
    val p = Pessoa("Adilson", "Utiama", 40)

    println(p.mostrarDados())

    p.nome = "Wilson"

    println(p.nome)
}
