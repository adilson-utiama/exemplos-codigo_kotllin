package excercises

    fun reverseUsingStringBuilder(palavra: String): String {
        var builder = StringBuilder(palavra)
        return builder.reverse().toString()
    }

    fun reverseUsingLoop(palavra: String): String {
        var inverso: String = ""
        for(letra in palavra.length - 1 downTo 0){
            inverso = inverso.plus(palavra.get(letra))
        }
        return inverso
    }
