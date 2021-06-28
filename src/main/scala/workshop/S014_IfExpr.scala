package workshop

object S014_IfExpr extends  App {
  // in Java, if else is statement, a statement will not return output itself
  // in Scala, if else is an expression, an expression will return output

  // Python if expression  :  True if (10 % 2 == 0) else False

  // if statement itself returns output
  // n is 10
  val n = if (true) 10
  // m is 20
  val m = if (false) 10 else 20

  //returns Even or Odd
  def oddOrEven(n: Int) = {
    // output of if statement is returned as result
    if (n % 2 == 0) "Even" // returned
    else "Odd" // returned
  }

  // if else with block statement
  def whichIsGreater(a: Int, b: Int, c: Int) = {
     if (a > b && a > c) {
       "a" // return a
     } else {
       if (b > c) {
         "b" // return b
       } else {
         "c" // return c
       }
     }
  }

  println (whichIsGreater(10, 20, 30)) // c
  println (whichIsGreater(30, 20, 10)) // a
  println (whichIsGreater(20, 30, 10)) // b


}
