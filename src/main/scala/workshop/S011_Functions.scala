package workshop

object S011_Functions extends  App {
  // Scala Functions something similar to  Lambda in Java 8
  // Functions are annonymous, no name
  // Functions are objects,  Methods are NOT objects
  // We can pass functions as parameter, return function as result, assign as variable ref etc
  // In functional terminology, Functions are first class citizens
  // Functions are defined using FunctionN traits or
  // using => as syntatic sugar

  // Scala 2.11, JVM 7 , Functions are implemented using trait, classes
  // Scala 2.12 onwards, functions are implemented using Java 8 Lambda

  // power here is just a variable reference, not like method def <<NAME>>
  val power = (n: Int) => n * n

  val add = (a: Int, b: Int) => a + b

  // multiline/block supported
  val sub = (a: Int, b: Int) => {
    println(a, b)
    a - b // return value
  }

  println(power(10))
  println(add(10, 5))
  println(sub(10, 5))

  // Functions shall have a method called apply, created by default while using =>
  // if we call power(10), internally this converts to power.apply(10) by scala compilter
  println(power.apply(10)) // same as calling power(10)
  println(add.apply(10, 5)) // same as add(10, 5)
}
