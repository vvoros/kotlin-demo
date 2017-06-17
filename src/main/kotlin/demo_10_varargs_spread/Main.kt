package demo_10_varargs_spread

fun sumNumbers(vararg numbers: Int): Int {
  var sum = 0
  for (num in numbers) {
    sum += num
  }
  return sum
}

fun main(args: Array<String>) {
  val numList = intArrayOf(1, 2, 3, 4, 5)

  val sum = sumNumbers(1, 2, 3, 4, 5)
  println(sumNumbers(*numList))
}
