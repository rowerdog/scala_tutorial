package main.scala.chapter06

/**
  * @ClassName: Test10_Recursion
  * @Description
  * @Author gengmb on 2021/9/3 15:17
  * @Version: 1.0
  */
object Test10_Recursion {
  def main(args: Array[String]): Unit = {

    def fact(n: Int): Int={
      if(n==0) return 1
      fact(n-1)*n
    }

    println(fact(1000))


    //尾递归优化
    def tailFact(n: Int): Int = {
      def loop(n: Int,curRes: Int):Int = {
        if(n==1) return curRes
        loop(n-1,curRes*n)
      }
      loop(n,1)
    }

    println(tailFact(10))
  }
}
