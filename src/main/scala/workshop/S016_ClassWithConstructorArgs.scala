package workshop

object S016_ClassWithConstructorArgs extends  App {
  // id and name are constructor args, not object/class members
  // can be used through the class body
  // id and name are immutable
  // id and name are not MEMBER Variables
  class Product (id: Int, name: String) {
    println("Product created")
    println("ID", id)
    println("name", name)
  }

  val p1 = new Product(1, "Apple")
  val p2 = new Product(2, "Orange")

}
