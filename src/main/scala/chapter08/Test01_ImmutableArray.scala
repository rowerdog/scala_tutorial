package main.scala.chapter08

/**
  * @ClassName: Test01_ImmutableArray
  * @Description
  * @Author gengmb on 2021/9/10 16:12
  * @Version: 1.0
  */
object Test01_ImmutableArray {
  def main(args: Array[String]): Unit = {


    //定义一个数组

    val arr = new Array[Int](5)

    //另一种创建方式

    //val arr2 = Array.apply(Int,1,2)

    val arr2 = Array(1,2,3)
    println(arr2(1))

    //访问元素
    println(arr(0))
    println(arr(1))

    //修改元素的值
    arr(0) = 1
    println(arr(0))


    //1.for循环遍历元素
    println("for循环遍历元素")
    for(i<- 0 to arr2.length-1){
      println(arr2(i))
    }

    for(i <- 0 until arr2.length){
      println(arr2(i))
    }

    for(i <- arr2.indices) println(arr2(i))

    //2.增强for循环
    println("增强for循环")
    for(elem <- arr2) println(elem)

    //3.itreator
    println("itreator")
    val iter = arr2.iterator
    while(iter.hasNext){
      println(iter.next())
    }

    //foreach
    println("foreach")
    arr2.foreach(println)

    //mkString()
    println(arr2.mkString("--"))


    //数组中添加元素
    println("数组中添加元素")

    //:+添加到后面
    val newArr = arr2.:+(67)
    println(arr2.mkString("--"))
    println(newArr.mkString("--"))


    //.+:添加到前面

    val newArr2 = arr2.+:(100)
    println(newArr2.mkString("--"))


    //简化写法

    val newArr3 = newArr2 :+ 20
    val newArr4 = 100 +: 15 +: newArr2

    println(newArr4.mkString(","))


  }
}
