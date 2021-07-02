package workshop

object S059_Implicits extends  App {
  // for any method/function
  // implicit - scala compiler substitute a value on behalf of developer
  // explicit - developer pass the values
  // not to be confused with defaults , defaults are explicit only

  // implicit: compiler pass the values for parameter magically
  // based on DATA TYPE, not by parameter name
  // implicit can be limited by scope block, object scope, class scope, package scope...

  // implicit is NOT dependency injection

  {
    // set block scope for implicit
    // use case 1: Casting of data
    // doubleToInt is within block, it won't work outside block
    implicit def doubleToInt(d: Double) = {
      println("doubleToInt called", d)
      d.toInt
    }


    // doubleToInt is called magically
    val x: Int = 42.0
    println("x is ", x)
  }

  // val y: Int = 42.0 // ERROR, since doubleToInt is only limited with in scope

  {
    // the parameter name like n and b doesn't matter, but the DATA TYPE is
    implicit val n: Int = 10

    def add(a: Int) (implicit  b: Int) = a + b

    println(add(100)(200)) // a = 100, b = 200
    println(add(100)) // implicit b automagically invoked,  a = 100, b = 10
  }

  // use case 2:
  // library 1: spark, execution context, threading model
  // application: define the execution context, declare implicit for ExecutionContext
  // while using spark library, the implicit context shall be passed internally

}
