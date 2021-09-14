package main.scala.chapter08

/**
  * @ClassName: Test11_CommonOp
  * @Description
  * @Author gengmb on 2021/9/14 11:06
  * @Version: 1.0
  */
object Test11_CommonOp {

  def main(args: Array[String]): Unit = {

    val list = List(1,5,99,55,786)
    val set = Set(1,23,49,0,555)
    //(1)获取集合长度

    println(list.length)
    //(2)获取集合大小
    println(set.size)

    println(list.size)

    //(3) 循环遍历

    list.foreach(println)
    for(i <- 0 until list.length){
      println(list(i))
    }

    //(4) 迭代器
    println("iterator迭代器操作")
    val iterator = list.iterator
    while(iterator.hasNext){
      println(iterator.next())
    }
    //(5) 生成字符串
    println(list.mkString(","))

    //(6) 是否包含


    println(list.contains(1))
    println(set.contains(100))
  }

}
