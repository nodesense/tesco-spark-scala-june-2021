package workshop

object S009_MethodsVarsArg extends  App {
  // a method that accept variable number of arguments
  // String* means, String arg, ranging from 0 to n number of variables
  // names is seq/collection
  def printAll(names: String*) = {
    names.foreach(println)
  }

  def sum(numbers: Int*) = {
    var s = 0
    for (n <- numbers) {
      s += n
    }

    s // return value s, the last excuted expression value
  }

  // these values are passed to names*
  printAll("scala", "spark", "jvm", "hive")

  println (sum()) // sum with 0 args
  println (sum(10)) // sum with 1 arg
  println (sum(10, 20, 30, 40, 50)) // sum with 5 args


  // assume, we have list, seq
  // Convert List to arguments*
  val fruits = List("apple", "mango", "orange")
  //ERROR
  //printAll(fruits)
  // Convert List to splat/spread using _*, spread list to individual args
  printAll(fruits: _*) // extract the values from list, pass as arguments

  println (sum ( List(10, 20, 30, 40, 50): _*)   )
}
