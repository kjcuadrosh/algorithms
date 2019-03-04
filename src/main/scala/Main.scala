object SaveTheWorld extends App {


  println("Starting the program")


  def calculateSpecificDamage( order: Char, position: Int): Int = ???

  def calculateSwaps ( shieldResistance: Int, instructions: String): String = {


    var numberOfSwaps = 0
    val orders: List[Char] = instructions.toList
    val totalDamage: Int = orders.zipWithIndex
                                         .map{
                                           case (order, index ) => calculateSpecificDamage(order, index )
                                         }.fold(0)(_+_)

     Stream.iterate()

    ""
  }








}