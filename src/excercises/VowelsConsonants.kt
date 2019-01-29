package excercises

fun countVowels(phrase: String): Int {
    val VOWELS = "aeiou"
    var count = 0
    for(letter in phrase) {
        if(letter.toLowerCase() in VOWELS) count++
    }
    return count
}

fun countConsonants(phrase: String): Int {
    val CONSONANTS = "bcdfghjlmnpqrstvxz"
    var count = 0
    for(letter in phrase) {
        if(letter.toLowerCase() in CONSONANTS) count++
    }
    return count
}

fun countVowelsFilter(phrase: String) = phrase.filter { it.toLowerCase() in "aeiou" }.count()

//fun countVowelsFilter(phrase: String): Int {
//    return phrase.filter { hasVowel(it) }.count()
//}
//
//fun hasVowel(letter: Char): Boolean {
//    val VOWELS = "aeiou"
//    if(letter in VOWELS) return true
//    return false
//}