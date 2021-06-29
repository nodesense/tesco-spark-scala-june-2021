package workshop

object S022_ClassInheritance extends  App {
  // Inheritance to reuse base class/a class attributes or behaviours like member methods

  class Order(val id: Int, val amount: Double, protected var dis: Double) {
    protected var grandTotal: Double = 0

    protected def calculate() = {
      grandTotal = amount - amount * dis / 100.0
    }

    def getTotal() = grandTotal
  }

  // id, amount, dis are constructor arguments of OrderDelivery
  //  Order(id, amount, dis) is passing id, amount, dis to parent class Order
  // tax is member varaiable of OrderDerlivery
  class OrderDelivery(id: Int, amount: Double, dis: Double, val tax: Double)
          extends Order(id, amount, dis) {

    var grandTotalWithTax: Double = 0

    override protected  def calculate() = {
      super.calculate() // calculate Order.grandTotal
      grandTotalWithTax = grandTotal + grandTotal * tax / 100.0
    }

    def generateInvoice() = {
      this.calculate() // calling OrderDelivery.calculate
    }
  }

  val order1 : OrderDelivery = new OrderDelivery(1, 100, 20, 18)
  order1.generateInvoice()
  println("GrandTotal With Tax", order1.grandTotalWithTax)

}
