package workshop

object S040_ByNameCalling extends  App {
  def nano() = {
    println("nano called")
    System.nanoTime()
  }

  def showTime(t: Long) = {
    println("ShowTime called")
    println("Time is ")
    println(t)
  }

  // nano() to be called first,
  // output of nano is passed as input to showTime
  // call by value
  showTime(nano())

  println("-------------")

  //t: => Long where as t is a val of a function reference
  // => Long represent that a Block/ group of statements/single statement that returns Long
  // t is called as by name calling, because it is called without value
  def showTimeDelayed(t: => Long) = {
    println("showTimeDelayed called", t.getClass)
    // wheere we use t which is code block tht returns long type, not long data type
    val k = t // it will   nano () function here
    val k2 = t // it will call nano() function again
    println(k, k2)
  }

  // the code block nano() is not executed,
  // instead it is passed as is to showTimeDelayed as reference function block
  // by name calling
  showTimeDelayed(nano())

  def millis(): Long = {
    System.currentTimeMillis()
  }

  // not only nano function, any code block, can be used here as long as the code block returns Long
  showTimeDelayed(1000)
  showTimeDelayed(2000)
  showTimeDelayed({
    println("this is simple example block...")
    333333333 // returns long value
  })


  showTimeDelayed(millis())
}
