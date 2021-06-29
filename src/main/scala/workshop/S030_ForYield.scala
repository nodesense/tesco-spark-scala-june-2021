package workshop

object S030_ForYield extends  App {
  // for yield shall make for loop as an expression
  // for yield is an expression that returns output/result

  // complete the loop and return numbers * 2
  // the loop returns output
  val evens = for (i <- 1 to 10) yield i * 2
  println("Evens", evens)

  // for yeild with multiline/def

  // conditional if, guard
  // returns only even numbers
  val evenNumbers = for ( i <- 1 to 10 if i % 2 == 0) yield i
  val oddNumbers = for ( i <- 1 to 10 if i % 2 == 1) yield i

  println(evenNumbers)
  println(oddNumbers)

}
