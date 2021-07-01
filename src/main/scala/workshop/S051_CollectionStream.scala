package workshop

object S051_CollectionStream extends  App {
  // Stream in collection is basically lazy eval
  val stream = Stream[Int] (1, 2, 3, 4, 5)

  val stream2 = stream.map( n => {
    println(s"map $n * 10 ")
    n * 10
  })

  //stream2.take(4).print("\r\n") // print first 2 numbers

  println("Min is " , stream2.min)


}
