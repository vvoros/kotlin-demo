package demo_03_functions

fun main(args: Array<String>) {
  myPrint("Max: ${max(3, 5)}")
}

fun myPrint(s: String): Unit {
  println(s)
}

fun max(a: Int, b: Int): Int {
  if (a > b) {
    return a
  } else {
    return b
  }
}
