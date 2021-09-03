package main.scala.chapter06

/**
  * @ClassName: Test11_ControlAbstraction
  * @Description  控制抽象
  * @Author gengmb on 2021/9/3 15:34
  * @Version: 1.0
  */
object Test11_ControlAbstraction {
  //控制抽象
  def main(args: Array[String]): Unit = {

    //传值参数

    def f(a: Int):Unit={
      println("a="+a)
      println("a="+a)
    }

    def f0():Int = {
      println("fo调用")
      12
    }

    f(f0())


    //传名参数，和Lambda表达式还真不一样
    //传入的是代码块，a替换为代码块

    def f2(a: =>Int):Unit = {
      println("a="+a)
      println("a="+a)
    }
    f2(50)
    f2(f0())

    def f3(a: ()=>Int):Unit = {
      println("a="+a)
      println("a="+a)
    }
    f3(f0)
  }
}
