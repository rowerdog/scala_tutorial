package chapter03

import scala.util.control.Breaks

/**
  * @ClassName: Test04_Break
  * @Description
  * @Author gengmb on 2021/8/25 17:33
  * @Version: 1.0
  */
object Test04_Break {
  def main(args: Array[String]): Unit = {

    Breaks.breakable(
      for(i <- 1 to 10){
        if(i==5)
          Breaks.break()
        println(i)
      }
    )
    println("循环外的代码")

  }
}
