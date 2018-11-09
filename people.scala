case class Person(firstName: String, lastName: String) {
  def name = firstName + " " + lastName
}

object Person {
  def apply(fullName: String): Person = {
    val nameParts = fullName.split(" ")
    apply(nameParts(0), nameParts(1))
  }
}
