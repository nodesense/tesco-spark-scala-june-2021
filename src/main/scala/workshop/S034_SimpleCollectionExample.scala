package workshop

object S034_SimpleCollectionExample extends  App {
  val names: List[String] = List("python", "scala", "java", "jvm")
  // key, value / dict
  val countryCode: Map[String, String] = Map[String, String] (
                                            "IN" -> "India",
                                                   "USA" -> "United States of America" )

  // tuple are defined using () or using ->
  val t0 = () // Unit
  println ("t0 is ", t0)

  val t1 = Tuple1(10) // Tuple1[Int]
  val t2 = (10, 45.34) // Tuple2[Int, Double]

  // how to access names?
  println(names(1)) // access list by using index but we need to use paranthesis ()
  println (countryCode ("IN") ) // use paranthesis / function call to access element
  // how to access tuple,
  // tuples are statically compiled, each element has its own type
  // tuples are accessible using _1, _2,... etc
  println(t1._1)
  println(t2._1, t2._2)
}
