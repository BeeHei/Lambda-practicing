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
}

