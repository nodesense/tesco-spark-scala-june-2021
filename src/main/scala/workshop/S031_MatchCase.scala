package workshop

object S031_MatchCase extends  App {
  // in java, we have switch case.. default which is a statement, doesn't return value
  // in scala, we have match and case, which is an expression, return the value

  val n: Int = 20

  // this match returns output, which is assigned back to result
  val result = n match {
    case 0 => "Zero"
    case 1 => "One"
    case 2 => "Two"
    case _ => "Unknown" // _ represent default case
  }

  println(n, result)

  // match returned result returned back to caller
  def oddOrEven(n: Int) = n % 2 match {
    case 0 => "Even" // return
    case 1 => "Odd" // return
  }

  println(oddOrEven((10)))
  println(oddOrEven((11)))

}
