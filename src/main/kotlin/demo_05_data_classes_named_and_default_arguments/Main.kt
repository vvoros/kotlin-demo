package demo_05_data_classes_named_and_default_arguments

fun main(args: Array<String>) {
  val customer1 = Customer("Bob", "bob@company.com")
  val customer2 = Customer("Bob", "bob@company.com")

  println(customer1)
  println(customer1 == customer2)

  val customer3 = Customer("Doe", "doe@company.com", phone = "123456789", rich = true)
  println(customer3)
}
