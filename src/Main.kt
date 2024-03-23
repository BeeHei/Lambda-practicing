fun main() {

    val coffeeMachine = CoffeeMachine()

    val name = "latte"
    val filter: (String) -> Unit = { argName: String ->
        println("Filtered $argName")
    }

    coffeeMachine.prepareToDrink(name, filter)

    coffeeMachine.prepareToDrink(name, { println("Filtered $it") })

    coffeeMachine.prepareToDrink(name) { println("Filtered $it") }

val filter2: (String)->Unit = coffeeMachine::filter
    coffeeMachine.prepareToDrink(name, filter2)

    val l = coffeeMachine.calculate(1)
    val s = l.invoke(2,3)
    println(s)

}

class CoffeeMachine {

    fun prepareToDrink(
        name: String,
        myFilter: (String) -> Unit
    ) {
        myFilter.invoke("$name.")
        println("Prepared $name.")
    }

    fun filter(name: String){
        println("Filtered $name")
    }

    fun calculate(number: Int): (Int, Int)-> String{
        val l = {n1: Int, n2: Int->
            val sum = number + n1 + n2
        sum.toString()}
        return l
    }
    }

