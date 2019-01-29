package excercises

fun sumAllParameters(vararg args: Int) = args.sum()

fun <T> sumAllGenericParameters(vararg args: T): Double {
    var sum: Double = 0.0
    for(n in args) {
        if(n is Int) {
            sum += n
        } else if(n is Double) {
            sum += n
        }
    }
    return sum
}

