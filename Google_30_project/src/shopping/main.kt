package shopping
import java.util.*
//Functions
fun day() : String {
    //Arrays
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun declaration(){
    //Pairs
    val day="Rainy day" to "Sunny Day"
    val today=day()
    val d = 40
    //Lambdas
    val discount = { d: Int -> d-10 }
    println("Today is a ${today} and a ${day.second}...Lets go shopping!")
    //Creating instance of class wishlist
    val wish = wishlist(snacks=20,juices=30)
    wish.price()
    println("I expected ${d} % discount but there was only ${discount(d)} % discount")
    //Creating instance of class list
    val pricelist = list()
    pricelist.money()
    pricelist.price()

}
//main
fun main(){
    declaration()
}