package workshop

object S053_Options extends  App {
  // Buy a movie ticket -> We have ticket, or no ticket
  // Option are best way to handle the exception

  // Parse the number, either get the parsed number or throw exception
  def parseInt(input: String): Int = { // let it crash
    input.toInt
  }

  // What is option, how to work with that
  //Option[Int] either has some value or None but don't throw exception
  def toInt(input: String): Option[Int] = {
    try {
      Some(input.toInt) // return some value if all ok
    }catch {
      case t:  Throwable => None // return no value or none if there is error
    }
  }

  println(parseInt("10")) // works
 // println(parseInt("NaN")) // shall not work

  println(toInt("10")) // Some value
  println(toInt("NaN")) // None output

  //what toInt returns?
  val goodResult: Option[Int] = toInt("10")
  if (goodResult.isDefined) {
    println("Yes we have result now ", goodResult.get) // get will get output as Int
  }

  val badResult: Option[Int] = toInt("INF")
  if (badResult.isEmpty) {
    println("Bad No Data")
  }

  val dataPoints = List("10", "20", "30", "NaN",
                        "INF", "missing", "damage", "",
                        "40", "50")

 // val cleanData = dataPoints.map (parseInt) // Crash for NaN, INF etc
  // clean data is List[Option[Int]]
 val cleanData: List[Option[Int]] = dataPoints.map (toInt)
  println("Clean Data", cleanData)

  val results: List[Int] = cleanData.filter(option => option.isDefined)
    .map(option => option.get) // return Int only, leaving Option

  println("final results ", results)
  println("min", results.min)
  println("max", results.max)
  println("sum", results.sum)



  // option with far comprehension

  val result = for {
    a <- toInt("10")
    b <- toInt("20")
  } yield  a + b

  println("Result is ", result) // Some(30)

  val result2 = for {
    a <- toInt("Inf")
    b <- toInt("20")
  } yield  a + b

  println("result2 is ", result2) // None
}
