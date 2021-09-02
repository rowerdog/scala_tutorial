package chapter02

import scala.io.StdIn

/**
  * @ClassName: TestStdIn
  * @Description
  * @Author gengmb on 2021/8/25 9:02
  * @Version: 1.0
  */
object TestStdIn {
  def main(args: Array[String]): Unit = {
    println("请输入你的名字")
    val name: String = StdIn.readLine()
    println("请输入你的年龄")
    val age: Int = StdIn.readInt()
    println(s"welcome ${age}的${name}")
  }
}
