package main.scala.chapter07

/**
  * @ClassName: Test04_Access
  * @Description
  * @Author gengmb on 2021/9/6 13:44
  * @Version: 1.0
  */
object Test04_Access {
  def main(args: Array[String]): Unit = {


    val person = new Person
    //person.idCard   error，私有访问不到

    //person.name     protected 受保护的，同类，子类可以访问，同包不行
    println(person.sex)
    println(person.age)

    val worker = new Worker
    worker.printInfo()

  }
}


//定义一个子类
class Worker extends Person {

  override def printInfo(): Unit = {
    name = "bob"
    sex = "male"
    age = 16
    println(s"Worker: $name,$sex,$age")
  }

}
