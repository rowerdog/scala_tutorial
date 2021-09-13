package main.scala.chapter08

/**
  * @ClassName: Test03_MulArray
  * @Description
  * @Author gengmb on 2021/9/13 15:43
  * @Version: 1.0
  */
object Test03_MulArray {
  def main(args: Array[String]): Unit = {

    //多维数组

    val arr: Array[Array[Int]] = Array.ofDim[Int](2,3)

    arr(0)(1) = 20
    arr(1)(2) = 60

    //遍历
    for(i <- 0 until arr.length;j <- 0 until arr(i).length){
      println(arr(i)(j))
    }

    //foreach遍历
    arr.foreach(line=>line.foreach(println))


    //简写
    arr.foreach(_.foreach(println))
  }
}
