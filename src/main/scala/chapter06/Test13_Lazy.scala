package main.scala.chapter06

/**
  * @ClassName: Test13_Lazy
  * @Description
  * @Author gengmb on 2021/9/3 16:10
  * @Version: 1.0
  */
object Test13_Lazy {
  def main(args: Array[String]): Unit = {

    lazy val result = sum(12,34)

    println("hello")
    println("hello"+result)
    def sum(i: Int, i1: Int): Int = {
      println("wocao")
      i+i1
    }
  }
}
