package workshop

object S057_Patterns extends  App {
  // pattern matching
  // case statement, try..catch, partial function, match statement
  case class Product(id: Int, price: Double)
  case class Book(id: Int, price: Double)
  case class Mobile(id: Int, price: Double)
  case class Furniture(id: Int, price: Double)

  def calculateGrantTotal(product: Object): Double = {
    product match {
      // variable pattern
      case p: Product => p.price + p.price * .18
      // extractor pattern
      case Book(_, price) => (price - price * .10)
      case m: Mobile =>  (m.price - m.price * .40) * 1.18  // 18 % tax
      // case with if guard,. add shipping cost 500 if price > 10000
      case f: Furniture if f.price > 10000 =>   (f.price - f.price * .15 ) * 1.18 + 500
      case f: Furniture =>   (f.price - f.price * .15 ) * 1.18
    }
  }

  println("Product ", calculateGrantTotal(Product(1, 100)))
  println("Book ", calculateGrantTotal(Book(1, 100)))
  println("Mobile ", calculateGrantTotal(Mobile(1, 10000)))
  println("Furniture above 10000 ", calculateGrantTotal(Furniture(1, 20000)))
  println("Furniture  ", calculateGrantTotal(Furniture(1, 5000)))

}
