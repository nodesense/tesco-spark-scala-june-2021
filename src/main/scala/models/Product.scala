package models

class Product(val id: Int, val name: String) {
  override def toString: String = s"Product($id, $name)"
}

object  Product {
  def apply(id: Int, name: String) = new Product(id, name)
}
