package moreFunctons

data class Fraction(val numerator: Int, val denominator: Int) {

    //Kotlin nos permite sobrecarregar alguns operadores em qualquer objeto que criamos,
    // ou que conhecemos (através de extensões).
    // O conceito de 'operator overloading' fornece uma maneira de invocar funções para executar operação aritmética,
    // verificações de igualdade ou comparação em qualquer objeto que quisermos,
    // através de símbolos como +, -, /, *,%, <,>. Mas, obviamente,
    // essas sobrecargas devem ser definidas quando faz sentido usá-las.
    operator fun plus(add: Fraction): Fraction {
        if(denominator == add.denominator) {
            return Fraction(numerator + add.numerator, denominator)
        } else {
            val common = denominator + add.denominator
            return Fraction(
                    ((common / denominator) * numerator) +
                            ((common / add.denominator) * add.numerator),
                                common
            )
        }
    }

    operator fun inc(): Fraction {
        //implementaccao
        return this
    }
}

fun main(args: Array<String>) {

    var f1 = Fraction(3,2)
    var f2 = Fraction(5,3)

    println(f1 + f2)

    f1++ //utilizando opertaor overloading de incrementacao
}