package main.scala.chapter08

import scala.collection.mutable

/**
  * @ClassName: Test07_MutableSet
  * @Description
  * @Author gengmb on 2021/9/14 8:47
  * @Version: 1.0
  */
object Test07_MutableSet {
  def main(args: Array[String]): Unit = {

    //可变set

    val set: mutable.Set[Int] = mutable.Set(1,3,6,8,23,22,22)
    println(set)

    //添加元素

    set += 666
    set.add(100)
    println(set)

    //删除元素

    set -= 100
    set.remove(1)
    println(set)

    //合并列表

    val set1 = mutable.Set(1,2,3,4,5,6,7)
    //合并set 和set1给ste3
    val set3 = set ++ set1

    //合并set和set1给set
    set ++= set1

    println(set)


  }

}
