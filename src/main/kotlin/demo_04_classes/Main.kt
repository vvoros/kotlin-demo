package demo_04_classes

fun main(args: Array<String>) {
  val person = Person("Bob", true)
  person.isMarried = false

  println("${person.name}, married: ${person.isMarried}")
}
