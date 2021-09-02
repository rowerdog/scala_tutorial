package main.scala.chapter06

/**
  * @ClassName: Test02_FunctionDefine
  * @Description
  * @Author gengmb on 2021/9/2 15:52
  * @Version: 1.0
  */
object Test02_FunctionDefine {
  def main(args: Array[String]): Unit = {

    //函数定义

    //无参，无返回值

    def f1()={
      println("1.无参，无返回值")
    }

    println(f1())

    //无参，有返回值

    def f2(): String = {
      return "2.无参，有返回值"
    }
    println(f2())

    //有参，无返回值

    def f3(name: String): Unit = {
      println("3.有参，无返回值")
      println("name: "+name)
    }
    println(f3("bing"))

    //有参，有返回值

    def f4(name: String): String = {
      println("4.有参，有返回值")
      "wohe"+name+"shi hao pengyou"
    }
    println(f4("bing"))

    //多参，有返回值

    def f5(name: String,age: Int): String = {
      println("5.多参，有返回值")
      println(s"${age}的你，${name}")
      return "见面"
    }
    println(f5("bing",15))
  }
}
