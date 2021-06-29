package workshop

object S033_Exceptions extends  App {
  // Exceptions are abnormal programming error
  // raised on situation where the code doesn't how to proceed further

  // throw error, divide by zero

  // try catch also an expression,  the return values are returned back to caller
  // Best way to handle this situation is to use Try, Success, Failure, covered later
  val result = try {
    42 / 2  // returned as result if no error
  }catch  {
    //works like match case
    case e: ArithmeticException => "divide by zero error"
    case _ => "Unknown error"
  }

  println ("REsult from try..catch " + result)
  println("welcome to scala")
}
