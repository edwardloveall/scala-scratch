case class Cat(color: String, food: String)

case object ChipShop {
  def willServe(cat: Cat): Boolean = {
    cat match {
      case Cat(_, "Chips") => true
      case Cat(_, _) => false
    }
  }
}

val oswald = Cat("Black", "Milk")
val henderson = Cat("Ginger", "Chips")
val quentin = Cat("Tabby and White", "Curry")
