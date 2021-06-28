package workshop

object S005_DataTypes extends  App {
  // Java/Scala Data Types
  // 1. Primitive Types [Byte, Boolean, Short, Char, Int, Long, Float, Double
  // 2. Object Types [String, custom class objects, collections.....]

  // Scala Compiler: Compile Scala program and generate class byte codes
  //                 Scala compiler treats each primitives types to be Class type
  //                 while compiling, Scala map primitive class types to JVM native types
  //                 Scala Double, Byte, Int etc is mapped to double native type in JVM
  // JVM: Java Runtime, runs the byte code
                      // int, byte, double, float are native types

  // i value can be changed, mutable, var type
  var i: Int = 0

  i = i + 1
  i += 1
  // the operators +, -, >, < etc * / % all are member functions of class Int
  // scala support operator overloading
  println("I", i)
  // .+() is a function of class Int
  i = i.+(2) // i += 2
  println("I", i)
}
