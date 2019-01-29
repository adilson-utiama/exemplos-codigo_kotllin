package moreClasses

class Car(val model: String, val maxSpeed: Int) {

    //Sobre GET e SET - field
    var currentSpeed: Int = 0
        get() {
            return field
        }
        set(value) {
            if(value > this.maxSpeed) {
                throw Exception("Velocidade maxima excedida!")
            } else {
                //usamos field para referenciar a propriedade (this.currentSpeed)
                //se utilizarmos this.currentSpeed iria fazer chamadas recursivas no 'set'
                //gerando uma chamada infinita
                field = value
            }
        }
}

fun main(args: Array<String>) {

    var car = Car("Any", 220)
    car.currentSpeed = 50

    println(car.currentSpeed)
}
