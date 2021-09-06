package main.scala.chapter07

/**
  * @ClassName: Test07_Inherit
  * @Description  继承、多态
  * @Author gengmb on 2021/9/6 15:10
  * @Version: 1.0
  */
object Test07_Inherit {
  //继承、多态

  def main(args: Array[String]): Unit = {
    val student1 = new Student7("bing",17)

    val student2 = new Student7("bing",17,"11")

    def printPerson(person: Person7): Unit = {
      person.printInfo()
    }
    val teacher = new Teacher

    printPerson(student1)
    printPerson(teacher)
  }
}

class Person7(){

  var name: String = _
  var age: Int = _

  println("1.Person7的主构造器")

  def this(name: String,age: Int){
    this()
    println("2.Person7的辅助构造器")
    this.name = name
    this.age = age
  }

  def printInfo(): Unit = {
    println(s"Person7: name: $name age: $age")
  }
}

//extends关键字后面父类的构造器是哪一个就调用哪一个
class Student7(name: String,age: Int) extends Person7(name,age){
  var stdNo: String = _

  println("3.Student7的主构造器")

  def this(name: String,age: Int,stdNo: String){
    this(name,age)
    println("4.Student7的辅助构造器调用")
    this.stdNo = stdNo
  }

  override def printInfo(): Unit = {
    println(s"Stduent7: name: $name age: $age stdNo: $stdNo")
  }
}


class Teacher extends Person7{

  override def printInfo(): Unit = {
    println("teacher")
  }
}
