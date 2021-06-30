package workshop

object S043_PartialFunctions extends  App {
  // normal function
  // parameters: pre-condition for parameters  a > 0, b < 0 , b != 0 etc
  // in normal context/function, a function is invoked, and then we apply pre-condition or
  // the function throw exception


  // partial function: incomplete function with respect to input parameter constraint
  // Partial function always takes only one arg, return 1 result
  // PartialFunction[A, B]
  val divide = new PartialFunction[Int, Int] {
    def apply(x: Int) = 42 / x

    // to check whether function can accept a parameter or not
    // accept any values except x being 0
    override def isDefinedAt(x: Int): Boolean = x != 0
  }

  // ensure that 2 is right parameter
  if (divide.isDefinedAt(2)) {
    println(divide.apply(2))
    println(divide(2))
  }

  if (divide.isDefinedAt(0)) {
    // won't be called
  } else {
    println("not calling divide")
  }

  // make partial function creation easy with case statements
  // apply, isDefinedAt is written scala compiler itself
  val div: PartialFunction[Int, Int] = {
    case x: Int if x != 0       =>         42 / x
  }

  // ensure that 2 is right parameter
  if (div.isDefinedAt(2)) {
    println(div.apply(2))
    println(div(2))
  }

  if (div.isDefinedAt(0)) {
    // won't be called
  } else {
    println("not calling div")
  }

  // partial function, accept double as input, return double result
  //apply, isDefinedAt is written by scala compiler
  val sqrt: PartialFunction[Double, Double] = {
    case x: Double if x > 0       =>    Math.sqrt(x)
  }

  if (sqrt.isDefinedAt(-1)) {
    // won't execute
  }else {
    println("negative numbers not supported")
  }

  if (sqrt.isDefinedAt(4)) {
    println(sqrt(4))
  }

  println(Math.sqrt(-16)) // NaN
  println(Math.sqrt(16))

 val numbers = List[Double] (4, 9, 16, 25, -16, 36, 49, -64)
  // collect is higher order function, a function that accept another function as input
  // collect make use of partial function, it calls out isDefinedAt before calling function

 val results = numbers.collect(sqrt)
  println("results ", results)

}
