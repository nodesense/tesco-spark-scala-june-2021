package workshop

object S029_ForLoop extends  App {
  val range = 1.to(10)
  val range2 = 1 to 10 by 2 // increment by 2
  val range3 = 1 until 10

  println("range", range.toList)
  println("range2", range2.toList)
  println("range3", range3.toList)

  // scala for loop/ foreach , doesn't return output

  // Scala for loop is basically an iterator
  // syntactic sugar, scala rewrite teh for loop with for each construct internally
  for (i <- 1 to 10) println(i)

  println("---")

  for (i <- 0 to 20 by 4) {
    println(i)
  }

  println("----")
  (1 to 10 by 2).foreach(println)
}
