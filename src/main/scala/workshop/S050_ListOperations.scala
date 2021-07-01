package workshop

object S050_ListOperations extends  App {
  val numbers = (1 to 10).toList
  // List, List operations are eager one, evaluate first always
  // they are not lazy
  val odds = numbers.filter( n => {
     println("processing n, is odd ", n, n % 2 == 1)
     n % 2 == 1
  } )

  println(odds)

  // eagar
  val result2 = odds.map ( n => n * 10)
  println(result2)
  println(result2.min)
  println(result2.max)
  println(result2.sum)


  // flattening a collection
  //  collections of collections, we want to convert to single collection
  val numbers2 = List(List(10, 20,30), List(60, 70, 90))
  val flatList = numbers2.flatten

  println("list of list ", numbers2)
  println("flatList ", flatList)

  // the final result would be , flatted list
  val flatMapResult = numbers2.flatMap( list => {
    println("List is ", list)
    list // return the list as is
  })

  println(flatMapResult)


  // partitions, apply a condition, based on condition, the split the list into two parts
  // into a tuple of 2 members, odd and even
  val partition = numbers.partition( n => {
    n % 2 == 1
  } )

  println("Odd partitions", partition._1)
  println("even partitions", partition._2)


  // zip method
  val stocks = List("INF", "LT", "TCS", "HoneyWell")
  val companyNames = List("Infosys", "L&T", "Tata Consulting Services", "Honeywell international")
  // val dimensions = List("Daily", "Monthly", "Weekly", "Yearly")
  // will have tuple ("INF", "Infosys")
  val profiles = stocks.zip(companyNames)
  println("profiles", profiles)

  // reduce function
  // apply an operation, and reduce the values into 1 value

  // numbers are 1 to 10
  // reduce first/initial value is 1st element in the list
  val total = numbers.reduce( (acc, value) => {
    println( s"acc=$acc, value=$value, newAcc=($acc+$value) ")
    acc + value // sum of numbers
  })

  println("Total ", total)

  // reduce with _ magic
  // first underscore is acc, the second underscore is the value
  val total3 = numbers.reduce(_ + _)
  println("total ", total3)

  val total2 = (1 to 1).reduce( (acc, value) => {
    // won't be called as list itself has only one element
    println( s"with 1 number list, acc=$acc, value=$value, newAcc=($acc+$value) ")
    acc + value // sum of numbers
  })

  println("total2 ", total2)

  // reduce, the first element is used as initial value

  // fold, used to reduce/collect 1 result after applying some operations on data
  // however fold, accept default value as initial value
  // fold DOES NOT use the first element list as initial value
  // fold also called even for 1 element
  // reduce  function shall not be called for 1 element collection

  // 0  represent initial value
  val foldResult = numbers.fold(0) ( (acc, value) => {
    println(s"acc=$acc,value=$value, newAcc={$acc + $value}")
    acc + value
  })

  println("foldResult ", foldResult)




}
