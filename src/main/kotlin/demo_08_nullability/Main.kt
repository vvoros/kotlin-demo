package demo_08_nullability

/* Java version
int strLen(String s) {
  return s.length();
}
*/

fun strLen(s: String?) = s?.length

fun main(args: Array<String>) {
  println(strLen("How many?"))

  var a: String
  a = "abc"
  a = "xyz"
  // a = null
  println(strLen(a))

  var b: String?
  b = "abc"
  b = "xyz"
  b = null
  // println(b.length)

  val len = if (b != null) b.length else -1
  val len2 = b?.length
  var len3 = b?.length ?: -1
  println(len3)
  println(strLen(b))

  println(b!!.length)
}
