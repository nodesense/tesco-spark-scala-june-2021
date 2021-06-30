package workshop

object S012_FunctionsSyntax extends  App {
  // may confuse you...
  // functions by default goes with result type implicit
  // implicit result type/return type
  val add = (a: Int, b:  Int) => a + b

  // explicit return/result type Int
  //below code won't work, due to explicit return/result type Int
  // val sub = (a: Int, b:Int): Int => a - b
  // right way to compile the code
  // to declare variable
  //  val variableName: VariableType = expression;
  // sub - variableName
  // (Int, Int) => Int - function/Variable Type, accept 2 args, return 1 result
  // a -b - expression
  val sub: (Int, Int) => Int = (a, b) => a - b
  val sub2: Function2[Int, Int, Int] = (a, b) => a - b

  println(add(10, 20))
  println(sub(10, 20))
  println(add.apply(10, 20))
  println(sub.apply(10, 20))
  println(sub2(10, 20))
  println(sub2.apply(10, 20))

}
