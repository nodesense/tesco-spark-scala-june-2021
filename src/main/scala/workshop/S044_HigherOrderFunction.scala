package workshop

object S044_HigherOrderFunction extends  App {
  // a function that another function is called higher order function
  // sum of square of numbers
  // sum of cube of numbers
  // sum of numbers of identity
  // sum of anything of numbers sum of some abstraction
  // reusable at higher context, however there is lower level abstraction which is a function
  // this higher order doesn't know anything about lower level abstraction
  // whether it square, sqrt or cube....it doesn't know
  val sum = (numbers: List[Int], func: Int => Int) => {
    var s = 0
    for (n <- numbers) {
      // s += n sum of numbers, this is NOT THE SCOPE
      s += func(n) // where func is passed as parameter, abstraction, only caller knows what is it
    }
    s // return total sum value
  }

  val numbers = (1 to 10).toList
  println ( sum(numbers, n => n * n )  ) // sum of square
  println ( sum(numbers, n => n * n * n )  ) // sum of cube
  println ( sum(numbers, n => Math.sqrt(n).toInt )  ) // sum of sq rt result may lose precision
  println ( sum(numbers, n => n  )) // idendity function

}
