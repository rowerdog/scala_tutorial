package main.scala.chapter07

/**
  * @ClassName: Test04_ClassForAccess
  * @Description
  * @Author gengmb on 2021/9/6 13:45
  * @Version: 1.0
  */
object Test04_ClassForAccess {

}

//定义一个父类

class Person{

  private var idCard: String = "65535"
  protected var name: String = "alice"
  var sex: String = "female"

  private[chapter07] var age: Int = 18

  def printInfo() = {
    println(s"Person:$idCard,$name,$sex,$age")
  }
}
