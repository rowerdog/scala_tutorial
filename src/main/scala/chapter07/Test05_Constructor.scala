package main.scala.chapter07

/**
  * @ClassName: Test05_Constructor
  * @Description  测试构造器
  * @Author gengmb on 2021/9/6 14:13
  * @Version: 1.0
  */
object Test05_Constructor {

  //构造器特性
  def main(args: Array[String]): Unit = {
    val student = new Student1
    student.Student1()
    val student1 = new Student1("bing")
    val student2 = new Student1("bing",16)
  }
}


class Student1(){

  var name: String = _

  var age: Int = _

  println(s"1: 主构造器 name: $name age $age")

  def this(name:String){
    this()
    this.name = name
    println(s"2: 辅助构造器1 name: $name age $age")
  }

  def this(name: String,age: Int){
    this(name)
    this.age = age
    println(s"3: 辅助构造器2 name: $name age $age")
  }

  //同名方法
  def Student1(): Unit={
    println("一般方法调用")
  }
}
