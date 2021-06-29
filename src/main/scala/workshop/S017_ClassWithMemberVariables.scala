package workshop

object S017_ClassWithMemberVariables  extends  App {
  // define member variables in class constructor
  // member variable either mentioned by var or val
  // if any constructor args present, without var or val, it is treated as constrcutor arg
  // by default, scala assign public scope
  // id, name, price are member variables, are public scope
  // id, name are immutable, price is mutable
  class Product(val id:Int, val name: String, var price: Double) {
    println("Product created")
    println(id, name, price)
    println(this.id, this.name, this.price) // optional use of this
  }

  val p1 = new Product(1, "Apple", 50000)
  // access public members
  println(p1.id, p1.name, p1.price)
  p1.price = 48000 // price is mutable
  println(p1.id, p1.name, p1.price)
}
