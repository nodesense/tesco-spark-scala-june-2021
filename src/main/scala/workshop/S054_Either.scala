package workshop

object S054_Either extends  App {
  // Option => Get Some Value or None
  // Either => this or that
  // Either [Convention] => Right (Success Value) or Left (Fail/Exceptions)
  // Either => Right(200 OK with Content) or Left(4xx/5xx with error/exception)

  // Either is right biased

  // 1. parseInt
  // Right(converted int) or Left the exception or error
  def parseInt(input: String): Either[String, Int] = {
    try {
      Right(input.toInt)
    }catch {
      case t: Throwable => Left("Error while parsing " + t.getMessage)
    }
  }

  val x = parseInt("100")
  // x.isLeft shall be ralse, isRight will be true
  if (x.isRight) {
    val r: Int = x.right.get // 100, parsed int
    println("got right value ", r)
  }

  val y = parseInt("Inf")
  // is left shall be true, isright shall be false
  if (y.isLeft) {
    val msg = y.left.get // error message
    println("The error is ", msg)
  }

  //2. Http Response
  // Ok, or ClientError
  case class Ok(statusCode: Int, result: Object);
  case class ClientError(statusCode: Int, result: Object)

  def getProduct(id: Int): Either[ClientError, Ok] = {
    println("getProduct called for ", id)
    if (id % 2 == 0) Right(Ok(200, s"{result: true, product_id: $id}"))
    else Left(ClientError(404, "Not Found"))
  }

  val result1 = getProduct(2)
  println(result1.isRight, result1.right.get)

  val result2 = getProduct(1)
  println(result2.isLeft, result2.left.get)


  // using Either in for comprehension

  val productId:String = "100"

  println("----------")
  val result = for {
                      id <- parseInt(productId)
                      product <- getProduct(id)
                    } yield product;

  println("Product is ", result)

  // another example
  val e1 : Either[Exception, Int] = Right(1)
  //val e1 :  Either[Exception, Int] = Left(new Exception("Boom"))
  val e2: Either[Exception, Int] = Right(2)

  val result4 = for {
    a <- e1
    b <- e2
  } yield a + b

  println("sum value " , result4)
}
