package workshop

object S058_PatternsTuple extends  App {
  //val t3 = (1, "phone", 400)
  //val t3 = (1, "tablet", 400)
  //val t3 = (1, "laptop", 400)
  val t3 = (1, "laptop", 200)

  t3 match {
    // constant pattern
    case (id, "phone", price) => println("processing phone ", id, price)
    case (id, "tablet", price) => println("processsing tablet ", id, price)

    // tuple with if guard
    case d if d._3  > 300 => println("process price gt 300", d._1)
    // tuple
    case d => println("processing tuple as is ", d)
    case _ => println("unknown")
  }
}
