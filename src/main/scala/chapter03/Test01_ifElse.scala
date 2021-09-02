package chapter03

/**
  * @ClassName: Test01_ifElse
  * @Description
  * @Author gengmb on 2021/8/25 15:35
  * @Version: 1.0
  */
object Test01_ifElse {
  def main(args: Array[String]): Unit = {
    val age = 18
    val res = if(age >= 18) "成年" else "未成年"

    //循环遍历

    for(i <- 1 to 10){
      println(i+":hello world")
    }
    println("------------------")
    for(i <- 1 until 10){
      println(i + ":helloworld")
    }
    println("------------------")
    //集合遍历
    for( i <- Array(1,2,3)){
      println(i)
    }
    println("------------------")
    //循环守卫

    for(i <- 1 to 10 if i!=5){
      println(i)
    }
  }
}
