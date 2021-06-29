package workshop

object S028_TypeCasting extends  App {
  // cast one type to another type
  // basically done for base class to child class, base trait to child class/trait

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
  val v: Vehicle = car // allowed
  val d: Drive = car // allowed

  // Not allowed
   //val car2: Car = v  // not allowed
  // val v2: Vehicle = d // not allowed

  // Type casting, a developer decision to cast the variabels to specific type
  // using asInstanceOf
  var car2: Car = v.asInstanceOf[Car] // cast vehicle to car or throw exception if any type incompatiblity
  var v2: Vehicle = d.asInstanceOf[Vehicle] // cast drive to vehicle

  car2.stop()
  v2.start()

}
