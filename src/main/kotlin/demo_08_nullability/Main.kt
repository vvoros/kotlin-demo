package demo_08_nullability

/* Java version
int strLen(String s) {
  return s.length();
}
*/

fun strLen(s: String) = s.length

fun main(args: Array<String>) {
  println(strLen("How many?"))
}