package workshop

object S015_Class extends  App {
  // class, prototype of an instance
  // class, also known object factory

  // class consist of class name, member variables, member functions
  // in other words, class consist of attributes and behaviours/methods

  // every class we define, by default inherit from Object, Object has toString by default
  class Product {
    // this portion is called default constructor
    // class body known as constructor
    println("Product created")

    // override the Object toString with our own custom toString

    // called during print or concat with string
    override def toString: String = "My Product Object"
  }

  // create instance
  val product1 = new Product(); // calls constructor
  println(product1) //toString is called
  val s = "Welcome to " + product1
  println(s)



}

