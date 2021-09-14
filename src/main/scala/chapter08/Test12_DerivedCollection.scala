package main.scala.chapter08

/**
  * @ClassName: Test12_DerivedCollection
  * @Description
  * @Author gengmb on 2021/9/14 11:17
  * @Version: 1.0
  */
object Test12_DerivedCollection {
  def main(args: Array[String]): Unit = {

    val list1 = List(1,3,5,7,99,66)
    val list2 = List(3,5,7,45,90,60,19)

//    （1）获取集合的头
    println(list1.head)
//    （2）获取集合的尾（不是头的就是尾）
    //3,5,7,99,66 尾

    println(list1.tail)

//    （3）集合最后一个数据
    println(list1.last)
//    （4）集合初始数据（不包含最后一个）
    // 1,3,5,7,99  初始数据
    println(list1.init)

//    （5）反转
    println("反转")
    val reverse = list1.reverse
    println(reverse)
//    （6）取前（后）n个元素
    println("取前（后）n个元素")
    println(list1.take(3))
    println(list1.takeRight(4))
//    （7）去掉前（后）n个元素

    println(list1.drop(3))
    println(list1.dropRight(4))
//    （8）并集

    println("并集")
    val union = list1.union(list2)
    println("union" + union)
    // ::: 并集
    println(list1 ::: list2)

    //set并集，去重
    println("set 去重")
    val set1 = Set(1,3,5,7,99,66)
    val set2 = Set(3,5,7,45,90,60)
    println(set1.union(set2))


//    （9）交集
    val intersection = list1.intersect(list2)
    println(intersection)
//    （10）差集

    println("差集")
    val diff1 = list1.diff(list2)
    val diff2 = list2.diff(list1)
    println(diff1)
    println(diff2)
//    （11）拉链

    println("zip：拉链")
    println("zip" + list1.zip(list2))

    println("zip"+ list2.zip(list1))

//    （12）滑窗
    println("滑窗")
    val iterator = list1.sliding(3)
    for(elem <- list1.sliding(3)){
      println(elem)
    }
    //滑动步长是2
   for(elem <-  list1.sliding(3,2)){
     println(elem)
   }

//
  }
}
