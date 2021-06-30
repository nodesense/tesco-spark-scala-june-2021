package workshop

object S010_MethodToFunction extends  App {
  def add(a: Int, b: Int) = a + b

  // use scala _ to generate a wrapper function for add method
  val sum = add _

  // error
  // add.apply(10, 20)

  println(sum.apply(10, 20))
  println(sum(10,20))
}
