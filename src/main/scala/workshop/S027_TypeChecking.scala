package workshop

object S027_TypeChecking extends  App {
  class Product(val id: Int) {}
  class Brand;

  val p1 = new Product(10)

  println("InstanceOf Product",      p1.isInstanceOf[Product]   )
  println("InstanceOf Brand",      p1.isInstanceOf[Brand]   )

  println("class of product ", p1.getClass)

}
