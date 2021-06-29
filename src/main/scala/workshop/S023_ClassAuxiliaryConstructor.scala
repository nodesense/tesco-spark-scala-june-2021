package workshop

object S023_ClassAuxiliaryConstructor extends  App {
  // secondary, multiple constructors

  // def this(..)
  // not used widely
  // primary constructor
  class Order(val id: Int) {
    var amount: Double = 0; // default value
    // how do we have constructor that also accept amount along with id
    // add one more constructor  Auxiliary Constructor

    def this(id: Int, amount: Double) {
      this(id) // calls primary constructor Order(val id: Int)
      this.amount = amount
    }
  }

  val order1 = new Order(1)
  println(order1.amount)
  val order2 = new Order(2, 200)
  println(order2.amount)

}
