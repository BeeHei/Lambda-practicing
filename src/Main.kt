fun main() {

    val coffeeMachine = CoffeeMachine()

    val name = "latte"
    val filter: (String) -> Unit = { argName: String ->
        println("Filtered $argName")
    }

    coffeeMachine.prepareToDrink(name, filter)

    coffeeMachine.prepareToDrink(name, { println("Filtered $it") })

    coffeeMachine.prepareToDrink(name) { println("Filtered $it") }
}

class CoffeeMachine {

    fun prepareToDrink(
        name: String,
        myFilter: (String) -> Unit
    ) {
        myFilter.invoke("$name.")
        println("Prepared $name.")
    }
}

