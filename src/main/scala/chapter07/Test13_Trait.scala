package main.scala.chapter07

/**
  * @ClassName: Test13_Trait
  * @Description
  * @Author gengmb on 2021/9/8 9:37
  * @Version: 1.0
  */
object Test13_Trait {
  def main(args: Array[String]): Unit = {
    val student = new Student13
    student.sayHello()
    student.dating()
    student.play()
    student.study()
  }
}

class Person13{
  val name: String = "person"
  var age: Int = 18

  def sayHello(): Unit ={
    println("hello from:"+ name)
  }
}

/**
  * trait的意思是特征，特质
  * 类似与java中的接口
  */
trait Young{
  //声明抽象和非抽象属性

  var age: Int
  val name: String = "young"

  //声明抽象方法和非抽象方法

  def play(): Unit ={
    println(s"Young people $name is playing")
  }

  def dating()
}

class Student13 extends Person13 with Young{

  //重写冲突的属性
  override val name: String = "student"

  //实现抽象方法
   def dating(): Unit = {
     println(s"name: $name is dating")
   }

  //自己的方法

  def study(): Unit ={
    println(s"student $name is studying")
  }

  //重写父类方法
  override def sayHello(): Unit = {
    super.sayHello()
    println(s"hello from student $name")
  }
}

