package moreClasses

class Repository {
    fun execute(){}
}

class Business {

    //lateinit - inicializacao tardia

    //NAO funciona com  'val'
    lateinit var repo: Repository

    //valores Primitivos nao sao acecitos so com Objetos
    //lateinit var number: Int

    fun execute(){

        //Inicializado em algum momemnto do codigo
        repo = Repository()

    }
}
