package workshop

object S007_MethodsNamedArgs extends  App {
  def sum(a: Int, b: Int, c: Int) = a + b + c

  // typically args are passed left to right
  println (sum(10, 20, 30)) // a = 10, b = 20, c = 30
  //scala support named arguments, values can be passed based on variable name
  println (sum (b = 50, c= 100, a = 20)) //b = 50, c= 100, a = 20

  println(sum(200, c= 20, b= 80)) // a = 200, c= 20, b= 80
}
