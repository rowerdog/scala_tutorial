package main.scala.chapter07

/**
  * @ClassName: Test08_DynamicBind
  * @Description
  * @Author gengmb on 2021/9/6 15:53
  * @Version: 1.0
  */
object Test08_DynamicBind {
  def main(args: Array[String]): Unit = {

    //多态，完全的多态，连属性都是多态
    val person: Person8 = new Student8
    println(person.name)
    person.hello()
  }
}

class Person8{

  val name: String = "person"

  def hello(): Unit = {
    println("hello person")
  }
}


class Student8 extends Person8 {

  //重写

  override val name: String = "student"

  override def hello(): Unit = {
    println("hello student")
  }
}
