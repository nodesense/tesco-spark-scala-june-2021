package workshop

object S008_MethodsDefaultArgs extends  App {
  // if we don't pass the arguments, the values are taken from defaults
  // a is mandatory, b and c are optional parameters with default values
  // if b, c not passed, values 0 used against them
  def sum (a: Int, b: Int = 0, c: Int = 0) = a + b + c

  println (sum(10, 5, 1)) // a = 10, b = 5, c = 1
  println (sum(10)) // a = 10, b = 0, c = 0
  println (sum(10, b = 5)) // a = 10, b = 5, c = 0

  println(sum(a = 20)) // a = 20, b = 0, c = 0

}
