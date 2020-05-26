package shopping
//Parent Class with default parameters
open class list (open var snacks: Int = 10, open var juices: Int = 5){
    fun money(){
        println("I have money to purchase")
    }
    //open function
    open fun price(){

        val tot=snacks+juices;
        println(" Snacks: $snacks"+" Juice: $juices ")
        println("Total commodities: $tot")
    }


}