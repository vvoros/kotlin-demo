package demo_07_exceptions

fun main(args: Array<String>) {
  val percentage = 2000
  /*
  if (percentage !in 1..100) {
    throw IllegalArgumentException("Percentage out of range (1 - 100)")
  }
  */
  var e = if (percentage in 1..100) percentage else throw IllegalArgumentException("Ooops...")
  println(e)
}
