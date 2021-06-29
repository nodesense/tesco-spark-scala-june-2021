package workshop

object S019_ClassExcercise extends  App {
  // create a class called Student with below memver variable
  //  id Int , immutable public scope
  //  name String. immutable, public
  //  standard String, mutable, public
  // modify standard after creating them..
  class Student (val id: Int, val name: String, val standard: String) {
    override def toString: String = "Student " + id
  }

  val s1 = new Student(1, "Nila", "5th")
  println(s1) //calls toString

}
