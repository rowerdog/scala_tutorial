package main.scala.chapter08

/**
  * @ClassName: Test13_SimpleFunction
  * @Description
  * @Author gengmb on 2021/9/14 13:50
  * @Version: 1.0
  */
object Test13_SimpleFunction {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1, 5, -3, 4, 2, -7, 6)

    val list2 = List(("a",1),("b",5),("c",-3),("d",4),("e",2),("f",-7),("g",6))

    //1.求和

    println(list.sum)

    //2.求乘积

    println(list.product)

    //3.最大值

    println(list.max)

    //4.最小值

    println(list.min)

    //5.排序
    println("==============")
    //默认隐式规则，从小到大
    val sortedList = list.sorted
    println(sortedList)
    println("==============")
    println("从大到小")
    println(list.sorted(Ordering[Int].reverse))

    //5.1 按照元素大小排序，sortBy

    println(list2.sortBy(x => x._2))

    println(list.sortBy(x => x))

    //5.2 按照元素的绝对值大小排序

    println(list.sortBy(x => x.abs))

    //5.3 按照元素大小升序排序

    println(list.sortWith((x, y) => x < y))
    println(list.sortWith(_ < _))

    //5.4 按照元素大小降序排序

    println(list.sortWith((x, y) => x > y))
    println(list.sortWith(_ > _))
  }
}
