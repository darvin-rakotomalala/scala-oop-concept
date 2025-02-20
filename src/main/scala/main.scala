import class_object.{AnonymousObjectDemo, ClassObjectDemo, Dog}
import inner_class.{ClassObjectInnerDemo, InnerClassDemo}

@main
def main(): Unit =
  println("----------------------------------------------------------------")
  println("Hello world! This is a Scala program to illustrate OOP concepts.")
  println("- Classes and Objects examples")
  val cObj = new ClassObjectDemo()
  cObj.Display()

  var dogObj = new Dog("tuffy", "papillon", 5, "white");

  new AnonymousObjectDemo().display();

  println("----------------------------------------------------------------")
  println("- Inner class examples")
  val objOutClass = new InnerClassDemo
  val obInClass = new objOutClass.Dev1
  obInClass.method()

  println("- Class inside object and object inside class examples")
  val classOb = new ClassObjectInnerDemo
  classOb.InnerObject.methodObInClass()


