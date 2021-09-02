package chapter04

/**
  * @ClassName: Test04_Practice_CollectionOperator
  * @Description
  * @Author gengmb on 2021/8/27 13:57
  * @Version: 1.0
  */
object Test04_Practice_CollectionOperator {
  def main(args: Array[String]): Unit = {

    //实现一个map映射，使数组的每个元素做某种操作

    val array:Array[Int] = Array(1,2,3,4,5)
    def arrayOperation(array: Array[Int],op: Int=>Int): Array[Int] ={
      for(elem <- array) yield op(elem)
    }

    def addOne(elem:Int):Int={
      elem + 1
    }
    val newArray = arrayOperation(array,addOne)
    println(newArray.mkString(","))

    println(arrayOperation(array,elem=>elem*2).mkString(","))
    println(arrayOperation(array,_*2).mkString(","))

  }
}
