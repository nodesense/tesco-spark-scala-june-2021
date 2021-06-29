package workshop

object S020_ClassMemberMethods extends  App {
  class Order(val id: Int, val amount: Double, var discount: Double) {
     // memeber variabel here too
    var grandTotal: Double = 0
    // members methods, behavior
    // Java compatible getter/setter, means, can be accessible from java code
    def getAmount() = amount
    def getDiscount()= discount
    def setDiscount(value: Double) = discount = value;

    def calculate(): Unit = {
      println("calculate grand total ")
      grandTotal = amount - amount * discount / 100.0
    }
  }

  val order1 = new Order(1, 100, 20)
  order1.calculate()
  println("discount ", order1.getDiscount() )
  println(order1.grandTotal)

  order1.setDiscount(25)
  order1.calculate()
  println("discount ", order1.getDiscount() )
  println(order1.grandTotal)


}
