package inner_class

/**
 * Inner class means defining a class into another. This feature enables the user
 * to logically group classes that are only used in one place, thus this increases
 * the use of encapsulation, and create more readable and maintainable code. In Scala,
 * the concept of inner classes is different from Java. Like in Java,
 * the inner class is the member of the outer class, but in Scala,
 * the inner class is bound to the outer object.
 *
 * Syntax:
 * class Outer_class{
 * class Inner_class{
 * // Code...
 * }
 * }
 */

// Outer class
class InnerClassDemo {
  // Inner class
  class Dev1 {
    var a = 0

    def method(): Unit = {
      for (a <- 0 to 3) {
        println("Welcome to inner class: Dev1");
      }
    }

  }

}
