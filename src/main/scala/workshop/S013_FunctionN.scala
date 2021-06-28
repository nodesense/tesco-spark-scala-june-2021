package workshop

object S013_FunctionN extends  App {
  // Syntax sugar: the compiler writes a code for you
  // as a developer, you write less code for easier understanding
  // then compiler expand  you syntax to further

  // Scala compiler converts the functions with => fat arrow to FunctionN syntax
  // N start from 0 upto 22
  // where N stand for number of input args to function

  // define a function that accept 0 argument, return Unit/void result
  val greet = new Function0[Unit] {
    def apply(): Unit = println("Good Evening")
  }

  greet() // internally calls greet.apply()
  greet.apply()

  // define a function that accept 1 arg, return 1 result
  // accept Int, return Int
                            // [arg, return type], the last one is return type
  val power = new Function1[Int, Int] {
    def apply(n: Int): Int = n * n
  }
  // val power = (n: Int) => n * n


  // val add = (a : Int, b: Int) => a + b
  val add = new Function2[Int, Int, Int] {
    def apply(a: Int, b: Int): Int = a + b
  }

  println(power(10))
  println(power.apply(10))

  println(add(10, 20))
  println(add.apply(10, 20))

}
