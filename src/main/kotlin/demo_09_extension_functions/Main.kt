package demo_09_extension_functions

/* hidden function
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
*/

fun main(args: Array<String>) {
  val str: String = "My String"

  println(str.get(str.length - 1))
}
