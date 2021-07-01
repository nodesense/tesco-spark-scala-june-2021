package workshop

// import models._ // import all [Order, Product]
// import models.{Order, Product} // import specific classes in 1 line

import models.Order // like java
import models.Product // like java

//alias names, while importing give another due to some conflict
import models.{Order => NewOrder} // the Order class is imported as NewOrder

object S052_Packages  extends  App {
  val order1 = Order(10, 1000)
  val p1 = Product(1, "iphone") // companion object

  println(order1)
  println(p1)

  val o2 = NewOrder(20, 2000) // Alias for Order class
  println(o2)

  // Fully Qualified Name packagenames*.ClassName
  val o3 = models.Order(30, 3000)
  println(o3)
}
