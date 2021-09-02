package chapter03

/**
  * @ClassName: Test03_Practice
  * @Description
  * @Author gengmb on 2021/8/25 17:05
  * @Version: 1.0
  */
object Test03_Practice {
  def main(args: Array[String]): Unit = {
    //九层妖塔测试
    for(i <- 1 to 9 ){
      val stars = 2 * i - 1
      val spaces = 9 - i
      println(" "*spaces+"*"*stars)
    }
    println("---------------------")
    for(i <- 1 to 9;stars = 2 * i - 1;spaces = 9 - i){
      println(" "*spaces+"*"*stars)
    }
  }
}
