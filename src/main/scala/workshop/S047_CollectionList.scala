package workshop

object S047_CollectionList extends App{
  // companion object
  // immutable list
  val languages: List[String] = List("pypark", "scala", "R")
  // won't work since -= not supproted, the collection is immutable

  // access list item by index
  println("position 2", languages(1))

  // -- how to create new list easily
  val test = List("Test1", "Test2")
  // right associativity with overloading
  // simply done using Nil value
  val test2 =   "Spark" :: ("PySpark") :: "Text2"  :: Nil
  println(test2)

  val empty = Nil // empty collection

  println("Head ", languages.head)
  println("Tail ", languages.tail)
  println("isEmpty ", languages.isEmpty)


  // contact two lists using ::: operator
  val languages2 = List[String] ("C++", "C+", "C#")


  // 1 + 2 ==> 1.+(2)

  // TODO: on Scala 11
  val language3 = languages ::: languages2
  println(("concat list "), language3)

  val languages5 = List.concat(languages , languages2)

  // right associative nature languages2 coming in first, then languages
  val language4 = languages .::: (languages2)
  println(("concat list "), language4)

  println("Before ", languages)
  //we can't do inplace reverse, since this collection is immutable
  val languagesRev =  languages.reverse
  println("after ", languagesRev)


  val list100 = List.fill(100) (0)

  println(list100 ) // List of 100 values with value 0

  // read some data from external sources
  val sq = List.tabulate(4) (n => n * n)
  println(sq)


}
