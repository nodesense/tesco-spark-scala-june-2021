package workshop

import scala.collection.mutable.Map
object S048_CollectionMap extends  App {
  // Map is a key/value pair
  val countryCode: Map[String, String] = Map( "IN" -> "India", "CA" -> "Canada")

  countryCode += ("USA" -> "United States of America")

  countryCode += Tuple2("UK", "United Kingdom")

  println(countryCode)

  countryCode -= "UK"

  println(countryCode)

  case class Country(name: String, population: Long)
  val countryMap: Map[String, Country] = Map("IN" -> Country("India", 120))
  countryMap+= ("UK" -> Country("United Kingdom", 6))
  println(countryMap)

  // remove one entry from map
  countryMap -= "UK"
  println(countryMap)

  // map of Tuple value
  val countryMap2: Map[String, Tuple3[String, Long, Double] ] = Map("IN" -> ("India", 120, 7.0))

  countryMap2+= ("UK" -> ("United Kingdom", 6, 2.0))
  println(countryMap2)

  // same as  Tuple3[String, Long, Double]
  val countryMap3: Map[String, (String, Long, Double) ] = Map("IN" -> ("India", 120, 7.0))
  // value of the map is tuple
  countryMap3("IN")._1 // country code


}
