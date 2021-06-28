package workshop

object S004_Immutable extends  App {
  // immutable means const, ie values can't be changed once assigned
  // recommended in Scala

  // val, means value, immutable
  // PI value can't be changed later
  val PI: Double = 3.14
  println(PI)
  // Change the value, ERROR
  //PI = 2.14 // compiler error, reassignment to val

}
