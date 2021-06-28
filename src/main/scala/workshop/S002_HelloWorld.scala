package workshop

// Java interfaces are known as trait in Scala
// we have App trait which is built in
// App trait already has default main function
// we can write Scala main function functionalities by simply extending App trait
// preferred way of writing main function in scala
object S002_HelloWorld extends  App {
  // object constructor code here/part of main function
  println("Hello World")

  // args is from App trait
  println("Args " + args.length)
  args.foreach(println)
}
