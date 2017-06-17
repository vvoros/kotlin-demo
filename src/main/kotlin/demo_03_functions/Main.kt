package demo_03_functions

fun main(args: Array<String>) {
  myPrint("Max: ${max4(3, 5)}")
}

fun myPrint(s: String) {
  println(s)
}

fun max(a: Int, b: Int): Int {
  if (a > b) {
    return a
  } else {
    return b
  }
}

fun max2(a: Int, b: Int): Int {
  return if (a > b) a else b
}

fun max3(a: Int, b: Int): Int = if (a > b) a else b

fun max4(a: Int, b: Int) = if (a > b) a else b
