package workshop

object S056_Exceptions extends  App {
  // normal exception handling like Java
  // exception that try catch finally is an expression in  Scala, it returns output
  // catch block is pattern matching

  try {
    // val b = 10 / 2 // no error
    val b = 10 / 0 // error
    println("b is ", b) // called if no error on previous expression
  }
  catch {
    // called only on exception
    case t: Throwable => println("Error ", t)
  }
  finally  {
    // called on success/exception scenario
    println("Finally here")
  }
}
