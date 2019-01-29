package moreClasses

class Computer(val processor: String) {

    //Com 'inner' podemos ter acesso a propriedades da classe externa
    inner class Memory {
        fun getMemoryCapacity(): Int {
            println(processor)
            return 2000
        }
    }

    class Accessories {
        fun countAccessories() {
            //Nao temos acesso a 'processor'
            //println(processor)
            println("5 accessories")
        }
    }

}

fun main(args: Array<String>) {

    //classes com inner, precisamos invocar o construtor da classe externa ao instanciar
    //porem podemos acessar suas propriedades
    val memory: Computer.Memory = Computer("Intel").Memory()
    memory.getMemoryCapacity()

    //instanciacao de classes sem 'inner'
    val accessories = Computer.Accessories()
    accessories.countAccessories()

}