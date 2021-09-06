package main.scala.chapter07

/**
  * @ClassName: Test10_AnnoymousClass
  * @Description
  * @Author gengmb on 2021/9/6 16:46
  * @Version: 1.0
  */
object Test10_AnnoymousClass {
  def main(args: Array[String]): Unit = {
    //匿名类

    val person: Person10 = new Person10 {
      override var name: String = "bing"

      override def eat(): Unit = println("person10 eat")
    }
    person.eat()
  }
}

abstract class Person10{
  var name: String

  def eat(): Unit
}
