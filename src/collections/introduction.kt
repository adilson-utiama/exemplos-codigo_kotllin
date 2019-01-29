package collections

fun main(args: Array<String>) {

    //IMUTABLE LISTS ( NAO possuem metodos para alterar a lista)

    //A partir dos argumentos, ja consegue inferir o tipo, nao sendo obrigatorio especificar tipo "listOf<String>"
    val imutableList = listOf("Sao Paulo", "New York", "Tokyo")
    val imutableSet = setOf<String>("Sao Paulo", "New York", "Tokyo")
    val imutableMap = mapOf<String, String>(Pair("KEY", "VALUE"), Pair("Paris", "França"))


    //MUTABLE LISTS ( Possuem metodos para alterar a lista )
    var mutableList = mutableListOf("Sao Paulo", "New York", "Tokyo")
    mutableList.add("Berlim")
    val mutableSet = mutableSetOf("Sao Paulo", "New York", "Tokyo")
    mutableSet.add("Berlim")
    val mutableMap = mutableMapOf<String, String>(Pair("KEY", "VALUE"), Pair("Paris", "França"))
    mutableMap.put("Sidney", "Australia")
    val mutableHashMap = hashMapOf<String, String>(Pair("KEY", "VALUE"), Pair("Paris", "França"))
    mutableHashMap.put("Sidney", "Australia")

    var arrayList = arrayListOf("Sao Paulo", "New York", "Tokyo") //retorna um ArrayList
    arrayList.add("Sidney")
}


