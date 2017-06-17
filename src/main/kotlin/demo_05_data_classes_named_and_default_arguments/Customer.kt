package demo_05_data_classes_named_and_default_arguments

data class Customer(var name: String, var email: String, var rich: Boolean = false, var phone: String = "N/A")
