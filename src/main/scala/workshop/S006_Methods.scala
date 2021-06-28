package workshop

object S006_Methods extends  App {
  // methods are reusable code
  // defined using def keyword
  // accept 0 or more args as input, return 0 or 1 result
  // similar to Java member functions

  // accept 0 args, return void
  def greet(): Unit = println("Hello there")
  // accept 1 arg, return void
  def hello(name: String):Unit = println("Hello " + name)
  // accept 1 arg, return 1 value ie n ^ 2, no need to use return keyword
  def power(n: Int): Int = n * n

  // accept 2 args, return 1 value ie a + b
  def add(a: Int, b: Int): Int = a + b

  // return type is not mandatory, it can be implicit by compiler
  // compiler can study the code, and derive the return type automatically most of time
  // Implicit return type, Int
  def sub(a: Int, b: Int) = a - b

  // Block represented using  {}, group of statements together
  // using block  {} to write multiline code
  // the last executed statement is returned implicitly, no need of return statement
  def mul(a: Int, b: Int) = {
    println("mul called", a , b)
    // no return keyword
    // this is last executed statement in the method
    // last expr output returned implicitly
    a * b
  }

  //scala also support explicit return keyword
  // but return type must be mentioned, no implicit return type
  def div(a: Int, b: Int): Int = {
    println("div", a, b)
    // discouraged
    return a / b
  }

  greet()
  hello("Scala")
  println ("power of 3", power(3))
  println("Add ", add(10, 20))
  println("Sub ", sub(40, 10))
  println("Mul ", mul(10, 20))
  println("Div ", div(20, 10))

}
