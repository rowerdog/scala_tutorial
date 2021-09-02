package chapter04

/**
  * @ClassName: HighOrderFunction
  * @Description
  * @Author gengmb on 2021/8/27 10:24
  * @Version: 1.0
  */
object HighOrderFunction {
  def main(args: Array[String]): Unit = {
    def f(n:Int):Int = {
      println("f1调用")
      n+1
    }

    val result = f(12)
    println(result)

    //函数作为值传递
    val f1:Int=>Int = f;
    val f2:Int=>Int = f;
    println(f1)
    println(f1(0))
    println(f2)
    println(f2(3))


    //函数作为参数传递
    def ff(fu: (Int,Int)=>Int,a:Int,b:Int): Int = {
      fu(a,b)
    }

    println(ff((a, b) => a + b, 12, 20))
  }
}
