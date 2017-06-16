package demo_07_exceptions

fun main(args: Array<String>) {
  val percentage = 10

  if (percentage in 1..100) {
    throw IllegalArgumentException("Percentage out of range (1 - 100)")
  }

}
