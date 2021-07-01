package workshop

import scala.collection.mutable.ListBuffer

object S046_CollectionListBuffer extends  App {
  // Mutable List Buffer
  // Array vs List?
  // Array - Pick the index based on array index O(1)
  // List - iterate to pick the value by index O(n)
  // Linear seq
  val languages = ListBuffer[String] ("Scala", "Java", "JVM", "PySpark")

  languages += "R"
  languages.insert(5, "SQL")
  println(languages)

  languages -= "PySpark"

  languages.remove(2)
  println(languages)

  languages.clear() // remove all
  println(languages)

}
