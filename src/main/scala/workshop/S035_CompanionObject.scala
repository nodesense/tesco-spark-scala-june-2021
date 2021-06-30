package workshop

object S035_CompanionObject extends  App {
  // A class name and object name should be same on the same file
  // use cases: helpful to create object, in this way, it is object factory
  // use cases: no need use new keyword to create object, instead it uses apply to create object

  class Product(val id: Int, val name: String) {
    println("Product created ", id, name)
  }
  // now class Name Product and object Product are same, called companion object
  object Product {
    // companion object shall have apply function to create object
    def apply(): Product = {
      println("Product apply called with empty args")
      new Product(0, "")
    }

    def apply(id: Int): Product = {
      println("Product apply called with id")
      new Product(id, "unknown")
    }

    def apply(id: Int, name: String): Product = {
      println("Product apply called with id, name")
      new Product(id, name)
    }
  }

  // how to use companion object, to create objects
  // new keyword used to create object is not functional code , more of statement
  // below code means, it is called companion object Product.apply func
  val p0 = Product()
  // calls apply function  apply(id: Int): Product and product instance
  val p1 = Product(10)
  // calls apply(id: Int, name: String)
  val p3 = Product(10, "iphone")
}
