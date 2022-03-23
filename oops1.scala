class Person(name: String, age: Int) {

  override def equals(other: Any): Boolean = other.isInstanceOf[Employee]

  override def equals(that: Any): Boolean = {
    that match {
      case that: Person =>
        that.canEquals(this) && this.hashCode() == that.hashCode()
      case _ => false
    }
  }

}
class Employee(name: String, age: Int, role: String) extends Person(name age) {
  override def equals(other: Any): Boolean = other.isInstanceOf[Employee]

  // override def hashCode(): Int = ???

}

object opp extends App {
  val niran = Employee("niran", 51, "Techinal Lead")
  println(niran.toString)

}
