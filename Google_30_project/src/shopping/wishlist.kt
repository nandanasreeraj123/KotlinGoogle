package shopping
//Class inherited from list class
class wishlist(override var snacks:Int, override var juices:Int): list(snacks=snacks,juices=juices) {
    //Constructor
    init{
        println("I wish to purchase these")
    }

}