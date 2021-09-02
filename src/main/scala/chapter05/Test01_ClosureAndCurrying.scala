package main.scala.chapter05

/**
  * @ClassName: Test01_ClosureAndCurrying
  * @Description
  * @Author gengmb on 2021/9/1 15:11
  * @Version: 1.0
  */
object Test01_ClosureAndCurrying {
  def main(args: Array[String]): Unit = {

    //闭包
    //一个函数访问到他外部的变量的值，这就叫闭包？

    def addA(a:Int):Int=>Int={
      def addB(b:Int):Int={
        a+b
      }
      addB
    }

    val addFun1 = addA(5)
    val addFun2 = addA(43)
    println(addFun1(10))
    println(addFun2(200))

    //柯里化

    def addCurring(a:Int)(b:Int):Int={
      a+b
    }
    val temp1 = addCurring(10)(30)
    println(temp1)
  }
}
