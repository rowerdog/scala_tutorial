package main.scala.chapter05


/**
  * @ClassName: Test03_ControlAbstraction
  * @Description
  * @Author gengmb on 2021/9/1 16:35
  * @Version: 1.0
  */
object Test03_ControlAbstraction {
  def main(args: Array[String]): Unit = {

    //传值参数
    def f1(a:Int):Unit={
      println(a)
    }

    def f2():Int={
      println("xxx")
      12
    }
    f1(f2())

    println("=============================")
    //传名参数，传的是代码块
    //下面的代码，就是把a替换为传进来的代码块
    def f3(a: =>Int): Unit ={
      println("a:"+a)
      println("a:"+a)
    }
    f3(f2())
    f3(23)
  }
}
