package workshop

object S038_CaseObject extends  App {
  // case object, singleton, we can't produce more object from case object
  // unique object created only once
  // represent a command type
  // used in match cases, used in Akka where messgaing involved
  case object GetBrands;
  case object GetProducts;

  def request(request: Object) = request match {
    case GetProducts => List("p1", "p2", "p3")
    case GetBrands => List("Apple", "Samsung")

    // then put as many case class with specific instance
    case _ => "Unknown request"
  }

  println (request(GetProducts))

  println (request(GetBrands))

  println (request("Give me Invoices"))
}
