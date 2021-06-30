package workshop

object S041_CurryFunction extends  App {
  // a function that returns another function is called curry function
  // closure, a functional state, the value available within function even after function exit

  def seqGenerator(start: Int = 0, step: Int = 1) = {
    var current = start
    // this is seqGenerator body/block, we have three variables, current, start, step
    // closure, as long as seq func is visible/hold memory,
    // values of current, step will remain in memory even though seqGenerator exit
    // visiblity in OOP, closure, a functional state
    // current and step are referenced inside seq, as long as seq function reference exist
    // current and step values are maintained in memory
    val seq = () => {
      println("seq called")
      val retVal = current // to return current Value
      current += step
      retVal
    }

    seq // return  a function that returns a int
  }

  // 0, 1, 2, 3, 4, ......
  // seq0By1 is a function, that returns a seq int
  val seq0By1 = seqGenerator(0, 1)
  println (seq0By1()) // calling the seq function 0
  println (seq0By1()) // calling the seq function 1
  println (seq0By1()) // calling the seq function 2
  println (seq0By1()) // calling the seq function 3


  val seq10000By10 = seqGenerator(1000, 10)
  println (seq10000By10()) // 1000
  println (seq10000By10()) // 1010
  println (seq10000By10())   // 1020
  println (seq10000By10())// 1030


  println (seq0By1()) // 4

}
