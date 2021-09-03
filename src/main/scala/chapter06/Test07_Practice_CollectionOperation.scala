package main.scala.chapter06

/**
  * @ClassName: Test07_Practice_CollectionOperation
  * @Description
  * @Author gengmb on 2021/9/3 13:47
  * @Version: 1.0
  */
object Test07_Practice_CollectionOperation {
  def main(args: Array[String]): Unit = {

    var array = Array(12,35,10)

    //定义一个函数，用来处理数组，对数组的操作抽象出来，由参数传入

    def arrayOp(array: Array[Int],op: Int=>Int): Array[Int] = {
      for(elem <- array) yield op(elem)
    }

    def addOne(a: Int): Int={
      a+1
    }
    val newArray = arrayOp(array,addOne)
    println(newArray.mkString(","))


    //传入匿名函数

    val newArray2 = arrayOp(array,a=>a*2)
    println(newArray2.mkString(","))
  }
}
