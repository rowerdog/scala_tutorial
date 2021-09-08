package main.scala.chapter07

/**
  * @ClassName: Test12_Singleton
  * @Description
  * @Author gengmb on 2021/9/8 8:41
  * @Version: 1.0
  */
object Test12_Singleton {
  def main(args: Array[String]): Unit = {
    val student1 = Student12.getInstance()
    val student2 = Student12.getInstance()
    println(student1)
    println(student2)
  }
}

class Student12 private(val name: String,val age: Int){
  def printInfo(): Unit ={
    println(s"Student12: name: $name age: $age school: ${Student11.school}")
  }
}

//饿汉式加载
//object Student12{
//  private val student = new Student12("bing",16)
//
//  def getInstance():  Student12 = {
//    student
//  }
//}

//懒汉式加载
object Student12{
  private var student:Student12 = _
  def getInstance(): Student12 = {
    if(student==null){
      student = new Student12("bing",15)
    }
    student
  }
}


