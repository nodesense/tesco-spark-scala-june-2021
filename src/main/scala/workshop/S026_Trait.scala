package workshop

object S026_Trait extends  App {
  // Trait is similar to Java interface
  // is an abstraction
  // member declaration, default members also supported
  // Trait define polymorphic behavior

  trait Vehicle {
    def start()
    def stop()
    def is_running(): Boolean;

    def selfCheck() = {
      start(); // calls Car's start
      is_running() // calls car is_running function
      stop()
    }
  }

  trait Drive {
    def break()
    def accelerate()
    def clutch()
  }

  // extends can be used only one, second time onwards, use with keyword
  class Car extends Vehicle with Drive  {
    def start() = println("starting teh car")
    def stop(): Unit = println("Stop the car")
    def is_running(): Boolean = true

    def break() = println("Apply Break")
    def accelerate() = println("Apply accelerate")
    def clutch() = println("Apply clutch")
  }

  var car = new Car() // create instance for car

  val v:Vehicle = car // assign the car instance to trait variable
  v.start()
  v.is_running()
  v.stop()

  v.selfCheck()

  val d: Drive = car  // assign the car instance to drive variable
  d.break()
  d.clutch()
  d.accelerate()

}
