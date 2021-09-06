package main.scala.chapter07

import scala.beans.BeanProperty

/**
  * @ClassName: Test03_ClassAndObject
  * @Description
  * @Author gengmb on 2021/9/6 11:22
  * @Version: 1.0
  */
object Test03_ClassAndObject {
  def main(args: Array[String]): Unit = {

    val student = new Student()
    //student.name    //error,不能访问私有字段

    println(student.age)
    println(student.sex)

    student.setAge(1)
    println(student.getAge())
  }
}

class Student{
  private var name: String = "alice"
  //BeanProperty封装了set/get方法
  @BeanProperty
  var age: Int = _

  @BeanProperty
  var sex: String = _
}
