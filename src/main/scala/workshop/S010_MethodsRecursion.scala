package workshop

object S010_MethodsRecursion extends  App {
  def fact(n: Int) : Int = {
    if (n == 1) 1 // return 1 if n == 1
    else n * fact(n - 1) // return n * fact(n- 1)
  }

  println("Fact ", fact(5))
}
