package workshop

import scala.collection.mutable.ArrayBuffer

object S045_CollectionArrayBuffer extends  App {
  // two types of collection
  // 1. Immutable [once created, the original collection cannot be modified]
  // 2. Mutable [update,delete,insert]

  // Indexed
  // Mutable collection
  // ArrayBuffer
  val names = ArrayBuffer[String] ()
  // add items to name
  names += "Scala"
  names.insert(1, "PySpark", "Spark")
  names +=("JVM")

  println(names)

  // get item by specific index
  println(names(0))
  println(names(2))

  names.update(2, "Spark 3.0")
  println(names)

  names -= "PySpark"
  println(names)

  names.remove(0)
  println(names)

}
