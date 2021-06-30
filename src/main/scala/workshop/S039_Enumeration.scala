package workshop

object S039_Enumeration extends  App {
  object Weekday extends Enumeration {
    val Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday = Value
  }

  object Direction extends Enumeration {
    val East = Value(0)
    val West = Value(1)
    val North = Value(2)
    val South = Value(3)
  }

  println("East ", Direction.East)
  println("East Value ", Direction.East.id)

}
