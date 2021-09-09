package main.scala.chapter07

/**
  * @ClassName: Test17_Extends
  * @Description
  * @Author gengmb on 2021/9/8 16:06
  * @Version: 1.0
  */
object Test17_Extends {
  def main(args: Array[String]): Unit = {
    //1.类型检测和转换

    val student: Student17 = new Student17("bing",16)
    student.sayHi()
    student.study()

    val person: Person17 = new Student17("bo",18)

    println("person is person17："+person.isInstanceOf[Person17])//true
    println("person is Student17："+person.isInstanceOf[Student17])//true

    //类型转换

    if(person.isInstanceOf[Student17]){
      val newStudent = person.asInstanceOf[Student17]
      newStudent.study()
    }


    //输出类型
    println(classOf[Student17])


    //测试枚举类

    println(WorkDay.MONDAY)
  }
}

class Person17(val name: String,val age: Int){
  def sayHi(): Unit ={
    println("hi from person"+name)
  }
}

class Student17(name: String,age: Int) extends Person17(name,age){
  override def sayHi(): Unit = {
    println("hi from student"+name)
  }
  def study(): Unit ={
    println("student study")
  }
}


//测试枚举类

object WorkDay extends Enumeration{

  val MONDAY = Value(1,"MONDAY")
  val TUESDAY = Value(2,"TUESDAY")
}


//定义应用类对象

object MyApp extends App{


  type MyString = String
  val name: MyString = "abc"
  println(name)
}