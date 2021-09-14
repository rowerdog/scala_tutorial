package main.scala.chapter08

import scala.collection.mutable

/**
  * @ClassName: MutableMap
  * @Description
  * @Author gengmb on 2021/9/14 9:43
  * @Version: 1.0
  */
object MutableMap {
  def main(args: Array[String]): Unit = {
    //创建Map
    val map = mutable.Map("a"->100,"b"->1221,"c"->99)
    println(map)
    println(map.getClass)


    //添加元素

    map.put("j",111111)
    println(map)

    //删除元素

    map.remove("j")
    println(map)

    map.update("b",8889)
    println(map)

    //合并两个map

    val map1 = mutable.Map("cc"->123,"dd"->333)
    map ++= map1
    println(map)
  }
}
