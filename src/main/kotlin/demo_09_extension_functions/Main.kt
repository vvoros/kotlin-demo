package demo_09_extension_functions

fun <T> Collection<T>.joinToString(
  // Assigns default values for arguments
  separator: String = ",",
  prefix: String  = "",
  postfix: String = ""): String {

  val result = StringBuilder(prefix)

  // "this" refers to the receiver object: a collection of T
  for ((index, element) in this.withIndex()) {
    if (index > 0) {
      result.append(separator)
    }
    result.append(element)
  }
  result.append(postfix)

  return result.toString()
}

fun String.lastChar(): Char = this.get(this.length - 1)

fun main(args: Array<String>) {
  val str: String = "My String"

  println(str.get(str.length - 1))

  println(str.lastChar())

  val list = arrayListOf(1, 2, 3)
  println(list.joinToString(";", prefix = "-> "))
}
