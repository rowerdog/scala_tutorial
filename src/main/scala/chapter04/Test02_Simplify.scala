package chapter04

/**
  * @ClassName: Test02_Simplify
  * @Description
  * @Author gengmb on 2021/8/27 8:45
  * @Version: 1.0
  */
object Test02_Simplify {
  def main(args: Array[String]): Unit = {

    def f0(name: String): String = {
      return name
    }
    println(f0("linda"))

    //函数的最后一行作为返回值，可以省略return
    def f1(name: String): String = {
      name
    }
    println(f1("linda"))

    //如果函数体只有一行，那么花括号可以省略

    def f2(name: String): String = name

    println(f2("linda"))


    //3.返回值类型如果能推断出来，则可以省略

    def f3(name: String) = name
    println(f3("linda"))

    //4.如果无返回值类型，则可以省略函数的类型，叫做过程

    def f4(name: String){
      println("ok")
    }

    //5.匿名函数，lambda表达式

    (name: String) => {
      println(name)
    }

  }
}
