package moreClasses

//Com 'sealed' restringimos a heranca fora desta classe (arquivo)
//semelhante a alguns comportamentos de um enum
sealed class Result {

    fun doSomething() {
        println("Fazendo algo...")
    }

    //classe interna herdando da classe externa
    class Success(val msg: String): Result() {}

    class Error(val msg: String, val code: Int): Result() {}

}

//podemos herdar desde que esteja no mesmo arquivo
class Test(): Result() {

}

class Repo {

    fun execute(arg: Int): Result {
        if(arg > 10) {
            return Result.Success("Deu Certo!")
        } else {
            return Result.Error("Deu Erro!", 404)
        }
    }
}

fun main(args: Array<String>) {

    val repo = Repo()
    var result = repo.execute(15)

    when (result) {
        is Result.Success -> {
            println("Deu Certo!")
        }
        is Result.Error -> {
            println("Deu Erro!")
        }
    }

    val test = Test()
    test.doSomething()

}
