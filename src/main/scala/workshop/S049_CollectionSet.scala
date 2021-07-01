package workshop

import scala.collection.SortedSet

object S049_CollectionSet extends  App {
  // set a collection of unique elements, no duplicates
  // set is not indexed
  // set is not ordered
  val ageGroup: Set[Int] = Set(18, 25, 45, 60, 80, 45) // Duplicates shall be removed
  println(ageGroup)

  // index will not work
  // calling set with () means is to check whether element present or not
  println(ageGroup(2)) // False, 2 is not index number, we are checking whether 2 as elmeent present or not
  println(ageGroup(18)) // True

  val set2 = Set(10, 20) ++ Set(30, 40) // contact 2 sets
  println(set2)

  println("set values", ageGroup)
  println("head", ageGroup.head)
  println("tail", ageGroup.tail)

  // sorted set
  val sortedSet: SortedSet[Int] = SortedSet(60, 80,  25, 45, 18,45 ) // Duplicates shall be removed
  println("sortedSet", sortedSet)
}
