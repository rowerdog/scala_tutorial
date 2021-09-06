package main.scala.chapter07

/**
  * @ClassName: Test09_AbstractClass
  * @Description
  * @Author gengmb on 2021/9/6 16:20
  * @Version: 1.0
  */
object Test09_AbstractClass {
  def main(args: Array[String]): Unit = {

    val student = new Student9
    student.eat()

    student.sleep()

  }
}

abstract class Person9{


  //非抽象属性
  var name: String = "ppp"

  //抽象属性

  val age: Int

  //非抽象吃

  def eat(): Unit = {
    println("people eat")
  }

  //抽象方法

  def sleep(): Unit
}


class Student9 extends Person9{

  //实现抽象属性和方法
   val age: Int = 18

   def sleep(): Unit = {
    println("student9 sleep")
  }


  //重写非抽象属性和方法，val和var

  name = "bing"

  override def eat(): Unit = {
    super.eat()
  }
}