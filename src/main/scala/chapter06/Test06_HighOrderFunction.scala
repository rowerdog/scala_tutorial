package main.scala.chapter06

/**
  * @ClassName: Test06_HighOrderFunction
  * @Description
  * @Author gengmb on 2021/9/3 10:25
  * @Version: 1.0
  */
object Test06_HighOrderFunction {
  def main(args: Array[String]): Unit = {
    def f(n: Int): Int={
      println(n)
      n+1
    }

    //1.函数作为值传递

    //本质上是函数对象
    val f1: Int=>Int = f
    //main.scala.chapter06.Test06_HighOrderFunction$$$Lambda$1/81628611@4cdbe50f
    val f2 = f _
    //main.scala.chapter06.Test06_HighOrderFunction$$$Lambda$2/931919113@66d33a

    f1(1223)
    println(f1)
    f2(12)
    println(f2)

    //2.函数作为参数传递
    //二元计算函数

    def dualEval(func: (Int,Int)=>Int,a: Int,b: Int): Int={
      func(a,b)
    }

    def add(a: Int,b: Int): Int={
      a+b
    }

    println(dualEval(add, 12, 35))
    println(dualEval((a,b)=>a+b,12,35))
    println(dualEval(_+_,12,35))

    println("============================")
    //3.函数作为函数的返回值


    def f3(): Int=>Unit ={
      def f4(a: Int):Unit = {
        println("f4调用"+a)
      }
      f4
    }

    //首先看看f3的返回值
    //main.scala.chapter06.Test06_HighOrderFunction$$$Lambda$10/1018547642@56cbfb61
    //f3的返回值是一个函数
    println(f3())
    val func = f3()
    println(func(5))
    println(f3()(6))



  }
}
