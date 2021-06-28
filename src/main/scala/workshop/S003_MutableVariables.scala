package workshop

object S003_MutableVariables extends  App {
  // Scala is statically compiled programing language
  // mutable, changable, variable ,value can be changed
  // var , means variable, mutable
  // variable with type String
  var title:String = "Workshop"
  // name is String, type is declared automatically by Scala based on right side expression
  // type inferrence
  var name = "Scala"

  println(title)
  println(title.toUpperCase())
  println(name.toUpperCase())
  // changing the value, variable name, type remain same
  name = "Spark" // can be changed
  println(name.toUpperCase())

}
