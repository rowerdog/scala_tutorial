package main.scala.chapter06

/**
  * @ClassName: Test09_ClosureAndCurrying
  * @Description
  * @Author gengmb on 2021/9/3 15:05
  * @Version: 1.0
  */
object Test09_ClosureAndCurrying {
  def main(args: Array[String]): Unit = {



    //柯里化
    def twoNumPlus(a: Int):Int=>Int={
      def addA(b: Int):Int = {
        a+b
      }
      addA
    }

    println(twoNumPlus(12)(30))
    val add1 = twoNumPlus(8)
    val add2 = twoNumPlus(9)

    println(add1(12))
    println(add2(222))

    //Lambda表达式简化
    def addB(a: Int):Int=>Int= a+_
    //b=>a+b

    //柯里化表达，柯里化底层一定使用的是闭包

    def addC(a: Int)(b: Int):Int={
      a+b
    }

  }
}
