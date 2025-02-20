package inner_class

/**
 * Scala program to illustrate how to create an object inside a class,
 * Or a class inside an object
 * Syntax:
 * new outer_class().inner_object.method
 * new outer_object().inner_class().method
 */
class ClassObjectInnerDemo {

  object InnerObject {
    val q = 0;

    def methodObInClass(): Unit = {
      for (q <- 0 to 2) {
        println("object inside a class example")
      }
      println()
    }
  }

  // Class inside an object
  new OuterObjectDemo.InnerClass().methodClassInOb();

}

// Object inside Class
object OuterObjectDemo {

  class InnerClass {
    val s = 0;

    def methodClassInOb(): Unit = {
      for (s <- 0 to 2) {
        println("class inside an object example")
      }
    }
  }

}