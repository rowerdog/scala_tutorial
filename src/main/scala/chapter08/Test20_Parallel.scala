package main.scala.chapter08

import scala.collection.parallel.immutable.ParSeq

/**
  * @ClassName: Test20_Parallel
  * @Description
  * @Author gengmb on 2021/9/15 14:33
  * @Version: 1.0
  */
object Test20_Parallel {
  def main(args: Array[String]): Unit = {
    //单核运算
    val result = (1 to 100).map(

      elem => Thread.currentThread().getId
    )
    println(result)

    //并行运算
    val result1: ParSeq[Long] = (1 to 100).par.map(

      elem => Thread.currentThread().getId
    )
    println(result1)
  }
}
