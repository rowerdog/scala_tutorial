package main.scala.chapter06

/**
  * @ClassName: Test04_Simplify
  * @Description  测试函数的简化原则
  * @Author gengmb on 2021/9/3 8:36
  * @Version: 1.0
  */
object Test04_Simplify {
  def main(args: Array[String]): Unit = {

    def f1(name: String): String = {
      println(name)
      return name
    }
    f1("bing")

    //1.return可以省略，用最后一行的值作为返回值


    def f2(name: String): String ={
      println("f2: "+name)
      name
    }

    f2("bing")

    //2.函数体只有一条代码，可以省略花括号

    def f3(name: String): String = name

    println(f3("bing"))

    //3.返回值类型如果能够推断出来，则:返回值类型可以省略

    def f4(name: String) = "f4: "+ name

    println(f4("bing"))


    //4.如果函数是无返回值类型、那么可以省略=号
    def f5(name: String) {
      println("f5: "+name)
    }


    //5.如果函数是无参的，那么调用时可以加小括号或者不加

    def f6(): Unit = {
      println("f6: ")
    }

    f6()
    f6

    //匿名函数 lambda表达式

    val stringToUnit: String => Unit = (name: String) => {
      println(name)
    }



  }
}
