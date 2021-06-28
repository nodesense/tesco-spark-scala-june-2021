package workshop

// object means an instance already created
// object is an singleton instance
// wherever we use static keyword in Java, there we may see object
// java: static methods, static class variabels are represented as object in scala
// Scala main, use main method like java as part of object
object S001_HelloWorld {
  // scala method starts with def keyword
  // Array[String] is a generic
  // Unit is return type, represent void but actually it is empty tuple
  // a command line arguments
  def main(args: Array[String]): Unit = {
    // method body
    // semi colon is optional
    println("Hello World")

    println("Args " + args.length)
    args.foreach(println)
  }
}
