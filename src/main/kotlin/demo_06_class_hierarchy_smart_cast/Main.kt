package demo_06_class_hierarchy_smart_cast

open class Shape(val name: String) {
  open fun area() {
    println("Shape area")
  }
}

class Rect(name: String = "rect"): Shape(name) {
  override fun area() {
    println("Rect area")
  }

  fun iAmRect() {
    println("I am rect")
  }
}

class Circle(name: String = "circle"): Shape(name) {
  override fun area() {
    println("Circle area")
  }

  fun iAmCircle() {
    println("I am circle")
  }
}

fun main(args: Array<String>) {
  val s1: Shape
  s1 = Rect()
  val s2: Shape
  s2 = Circle()

  if (s1 is Rect) {
    println(s1.name)
    s1.area()
    s1.iAmRect()
  }

  println()

  if (s2 is Circle) {
    println(s2.name)
    s2.area()
    s2.iAmCircle()
  }
}
