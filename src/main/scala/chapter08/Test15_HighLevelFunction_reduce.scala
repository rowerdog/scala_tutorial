package main.scala.chapter08

/**
  * @ClassName: Test15_HighLevelFunction_reduce
  * @Description
  * @Author gengmb on 2021/9/14 17:11
  * @Version: 1.0
  */
object Test15_HighLevelFunction_reduce {
  def main(args: Array[String]): Unit = {

    //1.reduce，没有初值

    val list = List(1,2,3,4)

    println(list.reduce(_ + _))
    //从左向右加
    println(list.reduceLeft(_ + _))

    //从右向左加
    println(list.reduceRight(_ + _))

    println("=======================")

    val list2 = List(3,4,5,8,10)

    println(list2.reduce(_ - _))
    println(list2.reduceRight(_ - _))


    //2 fold  ，需要传入一个初值

    println("=======================")

    println(list.fold(10)(_+_))     //10 + 1 + 2 + 3+ 4

    println(list.fold(10))

  }
}
