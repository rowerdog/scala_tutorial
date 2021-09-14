package main.scala.chapter08

/**
  * @ClassName: Test06_ImmutableSet
  * @Description
  * @Author gengmb on 2021/9/14 8:36
  * @Version: 1.0
  */
object Test06_ImmutableSet {
  def main(args: Array[String]): Unit = {

    //不可变set

    //创建set

    val set1 = Set(1,2,3,33112,3,3,3)

    println(set1)

    //添加元素
    val set2 = set1.+(23) + 12

    println(set1)
    println(set2)

    //合并set

    val set3 = Set(12,222,33,444,56,6,6)
    val set4 = set3 ++ set2
    println(set4)

    //删除元素
    val set5 = set4 - 6
    println(set5)
  }
}
