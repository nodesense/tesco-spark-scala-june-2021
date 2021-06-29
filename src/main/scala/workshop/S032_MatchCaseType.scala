package workshop

object S032_MatchCaseType extends  App {

  class Order(val id: Int, val amount:Double)
  class RetailOrder(val id: Int, val amount: Double, val tax: Double)

  def processOrder(order: Object) = {
    order match {
      case order: Order => println("Order type", order.amount)
        // guard if in case statement
      case o: RetailOrder if o.tax >=18 => println("Lot of tax", o.tax )
      case o: RetailOrder => println("Retail order", o.tax)
      case _ => println("Unknown")
    }
  }

  processOrder(new Order(1, 100))
  processOrder(new RetailOrder(1, 200, 18))

  processOrder(new RetailOrder(1, 200, 12))

}
