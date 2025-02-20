package class_object

/**
 * Classes and Objects are basic concepts of Object Oriented Programming
 * which revolve around the real-life entities.
 *
 * Syntax:
 * class Class_name{
 * // methods and fields
 * }
 * Note: The default modifier of the class is public.
 *
 * Syntax Object:
 * var obj = new Dog();
 */
class ClassObjectDemo {

  // Class variables
  var number: Int = 16
  var nameofcompany: String = "Apple"

  // Class method
  def Display(): Unit = {
    println("Name of the company : " + nameofcompany);
    println("Total number of Smartphone generation: " + number);
  }

}
