package workshop

object S037_CaseClass extends App {
  // case class is a syntatic sugar,
  // scala expands case class, it create automatically a companion object
  // create class called Product, it also create companion object called Product
  // it also writes a apply function in the companion Object
  // the id, name are member variables of value type , immutable
  // no mention of val in the case class
  case class Product(id: Int, name: String)
  // new keyword is discouraged , when possible use comanion object
  val p1 = new Product(10, "apple")
  // without new keyword
  val p2 = Product(5, "Samsung phone 1")

  val p3 = Product.apply(3, "Redme 9")

  println(p1)
  println(p2)
  println(p3)
}
