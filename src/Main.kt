
fun main() {

    val coffeeMachine = CoffeeMachine()

    val name = "latte"
    val filter: (String) -> Unit = {argName: String ->
        println("Filtered $argName")
    }

    coffeeMachine.prepareToDrink(name, filter)
}

    class CoffeeMachine{

        fun prepareToDrink(name: String, myFilter: (String) -> Unit){
            myFilter.invoke("$name.")
            println("Prepared $name.")
        }
    }

