class Adder(amount: Int) {
  def apply(in: Int): Int = in + amount
}

case class Counter(count: Int = 0) {
  def inc = copy(count + 1)
  def dec = copy(count - 1)

  def adjust(adder: Adder): Counter = {
    copy(adder(count))
  }
}

val adder = new Adder(5)
// new Counter(10).adjust(adder).count
// 15
