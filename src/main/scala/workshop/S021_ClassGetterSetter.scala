package workshop

object S021_ClassGetterSetter extends  App {
  class Order(val id: Int, val amount: Double, private var dis: Double) {
    // scala getter
    def discount = dis

    // scala setter "discount_=" is a method name
    // special method, compiler will map order.discount = 15 to discount_= automatically
    // is not compatible with Java
    def discount_= (value: Double) = dis = value
  }

  val o1 = new Order(1, 100, 15 )
  println(o1.discount) // calls getter
  o1.discount =  25 //calls setter discount_=
  println(o1.discount) // calls getter
}
