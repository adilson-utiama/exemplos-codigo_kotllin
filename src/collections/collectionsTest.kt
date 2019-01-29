package collections

data class Food(val name: String, val calories: Double, val ingredients: List<Ingredients> = listOf())

data class Ingredients(val name: String, val quantity: Int)

fun hasIngredientList(list: List<Ingredients>, name: String): Boolean {
    return list.filter { it.name == name }.any()
}

fun main(args: Array<String>) {

    val data = listOf(
            Food("Lasanha", 1200.0,
                    listOf(Ingredients("Farinha", 1),
                            Ingredients("Presunto", 5),
                            Ingredients("Queijo", 10),
                            Ingredients("Molho de Tomate", 2),
                            Ingredients("Manjericão", 3)
                    )
            ),
            Food("Panqueca", 500.0),
            Food("Omelete", 200.0),
            Food("Parmegiana", 700.0),
            Food("Sopa de Feijão", 300.0),
            Food("Hamburguer", 2000.0,
                listOf(Ingredients("Pão", 1),
                        Ingredients("Hamburguer", 3),
                        Ingredients("Queijo", 1),
                        Ingredients("Catupiry", 1),
                        Ingredients("Bacon", 3),
                        Ingredients("Alface", 1),
                        Ingredients("Tomate", 1))
            )
    )

    //Tenho receitas na lista
    println("Tenho receitas? ${if (data.any()) "sim" else "nao"}.")

    //Quantas receitas tenho na colecao
    println("Tem ${ data.count() } receitas.")

    //Qual a primeira e ultima receita
    println("A primeira receita é ${ data.first().name }.")
    println("A ultima receita é ${ data.last().name }")

    //Qual a soma de calorias
    val sumCalories = data.sumByDouble { it.calories }
    println("A soma de calorias é $sumCalories ")

    //As duas primeiras receitas
    val firstTwo = data.take(2)
    for(x in firstTwo.withIndex()) { //tranforma item em chave-valor ( chave / objeto )
        println("${ x.index  } - ${ x.value.name }")
        println(x)
    }

    // Sei como fazer panquecas? e Sushi?
    val knowPancake = data.filter { it.name == "Panqueca" }.any()
    println("Sei faxzer panqueca? ${ if(knowPancake) "sim" else "nao" }")
    val knowSushi = data.filter { it.name == "Sushi" }.any()
    println("Sei fazer Sushi? ${ if(knowSushi) "sim" else "nao" } " )

    // Quais sao as comidas com mais de 500 calorias
    val more500 = data.filter { it.calories > 500 }.forEach { println(it.name) }

    // Par (chave, valor) de comidas com mais de 500 calorias ( name, calories )
    data.filter { it.calories > 500 }
            .map { Pair(it.name, it.calories) }
            .forEach { println("${it.first} : ${it.second} calories.") }

    // Quais das receitas possui farinha como ingrediente
    data.filter { it.ingredients.filter { it.name == "Farinha" }.any() }
            .forEach { println("Receita ${it.name} possui Farinha como ingrediente") }

    //outra resolucao usando uma funcao
    data.filter { hasIngredientList(it.ingredients, "Farinha") }
            .forEach { println("Receita ${it.name} possui Farinha como ingrediente") }

}
