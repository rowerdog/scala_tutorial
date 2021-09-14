package main.scala.chapter08

import scala.collection.mutable.ListBuffer

/**
  * @ClassName: Test05_ListBuffer
  * @Description
  * @Author gengmb on 2021/9/13 16:36
  * @Version: 1.0
  */
object Test05_ListBuffer {
  def main(args: Array[String]): Unit = {
    //可变列表


    //1.创建可变列表
    val list1 = new ListBuffer[Int]()
    val list2 = ListBuffer(1213,432423,88128)

    println(list1)
    println(list2)

    //2.添加元素


    list1.append(1)
    list2.prepend(2121211212)

    list1.insert(1,12121,321,2121121)

    println(list1)
    println(list2)


    //3.合并列表

    val list3 = list1 ++ list2

    println(list3)


    //4.修改元素

    list3(3) = 1111111
    println(list3)


    //5.删除元素

    list3.remove(5)
    println(list3)



  }
}
