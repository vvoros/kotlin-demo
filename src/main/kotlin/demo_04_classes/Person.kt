package demo_04_classes

class Person(val name: String, var isMarried: Boolean) {

  var customField: String = "something"
    get() {
      return "Hello Mr. ${field}"
    }

  val customField2: String
    get() = if (isMarried) "married" else "divorced"

  fun someMethod() {
    // ...
  }

  override fun toString(): String {
    return "${name} - ${customField2}"
  }
}
