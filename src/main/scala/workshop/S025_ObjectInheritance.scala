package workshop

object S025_ObjectInheritance extends  App {

  class Logger {
    var logLevel: String = "info"
  }

  // extend object from class
  object FileLogger extends Logger {
    def log (msg:String) = println (logLevel + " " + msg)
  }

  FileLogger.log("starting server")

}
