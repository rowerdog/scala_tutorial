package main.scala.chapter07

/**
  * @ClassName: Test11_Object
  * @Description
  * @Author gengmb on 2021/9/6 17:04
  * @Version: 1.0
  */
object Test11_Object {
  def main(args: Array[String]): Unit = {
//    val student = new Student11("bing",16)
//    student.printInfo()

    val student1 = Student11.newStudent11("bing",16)

    //调用 apply方法，底层编译器优化，可以直接不用调用apply
    val student2 = Student11("bing",16)

  }
}


//构造器私有化，通过伴生对象来生成对象
class Student11 private(val name: String,val age: Int){
  def printInfo(): Unit ={
    println(s"Student11: name: $name age: $age school: ${Student11.school}")
  }
}

object Student11{
  val school: String = "hit"

  def newStudent11(name: String,age: Int): Unit = new Student11(name,age)

  def apply(name: String,age: Int): Unit = new Student11(name,age)
}
