package workshop

object S024_Object extends  App {
  // Object itself is an instance
  // Represent singleton nature of object, only one instance
  // fulfil java static variable, method requirements

  object  Logger {
    // Object constructor, called on very first time, only once when object first used
    println("Initializing logger")
    // access also support public/default, private, protected access specifier

    // member variable
    // var/ or val
    val NAME = "Logger" // immutable
    var logLevel: String = "info" // mutable

    // member functions
    def info(msg: String) = println(msg)
    def error(msg: String) = println(msg)
  }

  println(Logger.NAME) // on the first use, it calls object constructor
  println(Logger.logLevel)

  Logger.info("Starting app server")

}
