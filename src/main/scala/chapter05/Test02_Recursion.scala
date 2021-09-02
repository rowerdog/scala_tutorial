package main.scala.chapter05

import scala.annotation.tailrec

/**
  * @ClassName: Test02_Recursion
  * @Description
  * @Author gengmb on 2021/9/1 16:08
  * @Version: 1.0
  */
object Test02_Recursion {
  def main(args: Array[String]): Unit = {

    //递归
    def fact(n: Int): Int={
      if(n==0) return 1
      return fact(n-1)*n
    }

    //尾递归实现
    def fact1(n: Int): Int={
      @tailrec
      def loop(n: Int,curRes: Int): Int={
        if(n==0) return curRes
        loop(n-1,curRes*n)
      }
      loop(n,1)
    }
  }
}
