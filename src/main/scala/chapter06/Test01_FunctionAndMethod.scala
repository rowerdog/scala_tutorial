package main.scala.chapter06

/**
  * @ClassName: Test01_FunctionAndMethod
  * @Description
  * @Author gengmb on 2021/9/2 15:33
  * @Version: 1.0
  */
object Test01_FunctionAndMethod {
  def main(args: Array[String]): Unit = {

    //定义函数
    def sayHello(name: String): Unit = {
      println("hi: "+name)
    }
    //函数的调用
    sayHello("piter")

    //方法的调用
    this.sayHello("pual")
    Test01_FunctionAndMethod.sayHello("alice")

    val bing = this.sayHello("bing",22)
    println(bing)
  }

  //定义对象的方法
  def sayHello(name: String): Unit = {
    println("Hi "+name)
  }

  //方法的重载
  def sayHello(name: String,age: Int): String = {
    println("hi: "+name)
    name
  }
}
