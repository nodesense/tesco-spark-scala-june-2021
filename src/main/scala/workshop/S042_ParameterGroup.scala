package workshop

object S042_ParameterGroup extends  App {
  // normal method
  def add(a: Int, b: Int, c: Int) =a + b  + c

  // def a method with parameter group
  // parameter meter group involves curry function concept, closure concepts
  def sum(a:Int) (b:Int) (c:Int) = a + b + c

  println(add(10, 20, 30)) // normal function call
  // create a wrapper function for sum method
  val sumFunc = sum _
  // sum10 is function that will accept b value
  val sum10 = sumFunc(10) // a = 10, returned another function as curry
  // sum10Plus20 is a function that will accept c value
  val sum10Plus20 = sum10(20) // b = 20, return another function as curry
  val result = sum10Plus20(30) // c = 30, return the output 10 + 20 + 30
  println(result)
  println(sum10Plus20(40)) // 10 + 20 + 40
  val sum10Plus200 = sum10(200)
  println(sum10Plus200(50)) // 10 + 200 + 50
}
