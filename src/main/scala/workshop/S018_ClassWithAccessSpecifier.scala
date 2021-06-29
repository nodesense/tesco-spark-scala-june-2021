package workshop

object  S018_ClassWithAccessSpecifier extends  App {
  // access specifiers
  // 1. public  [default],. no keyword called public
  // 2. private, keyword, only within class we can access
  // 3. protected , protected, discussed later with child class, accessible with in class, and child class

  class Product(private val id: Int, protected val name: String, val price:Double) {
    // access class members here
    println("Product created")
    println(id, name, price)
  }

  val p1 = new Product(1, "Apple", 345)
  // p1.id not accessible
  // p1.name is not accessible
  println(p1.price)


}
