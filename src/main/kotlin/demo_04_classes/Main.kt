package demo_04_classes

fun main(args: Array<String>) {
  val person = Person("Bob", true)
  person.isMarried = false

  println("${person.name}, married: ${person.isMarried}")

  person.customField = "something else"
  println(person.customField)
  println(person.customField2)

  println(person.toString())
}
