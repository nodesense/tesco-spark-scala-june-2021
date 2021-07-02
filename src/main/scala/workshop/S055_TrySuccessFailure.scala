package workshop
// TODO: Finally is there
import scala.util.{Try, Success, Failure}

object S055_TrySuccessFailure extends  App {
  // Try, Success, Failure is specailly for Error handling while processing data etc
  // Success - positive result
  // Failure - only Exception, no value here

  def toInt(input: String): Try[Int] = {
    Try(input.toInt) // the success value is result of the expression
    // if any exception, Failure returned
  }

  val x: Try[Int] = toInt("100")
  println(x.isSuccess, x.get) // True, 100
  val y: Try[Int] = toInt("Inf")
  // by calling y.get will throw same exception thrown by input.toInt
  println(y.isFailure, y.failed) // true, also exception as is

  // with for comprehension
  val result = for {
    a <- toInt("100")
    b <- toInt("200")
  } yield a + b

  println(result.isSuccess, result.get) // true, 300

  // with for comprehension
  val result2 = for {
    a <- toInt("Inf")
    b <- toInt("NaN")
  } yield a + b

  println(result2.isFailure, result2.failed) // true, actual exception by toInt

}
