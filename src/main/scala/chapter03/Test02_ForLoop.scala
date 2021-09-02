package chapter03

/**
  * @ClassName: Test02_ForLoop
  * @Description
  * @Author gengmb on 2021/8/25 16:35
  * @Version: 1.0
  */
object Test02_ForLoop {
  def main(args: Array[String]): Unit = {
    for(i <- 10 to 30 by 10){
      println(i)
    }
    println("------------")
    for(i <- 30 to 10 by -10){
      println(i)
    }
    println("------------")
    //倒序输出
    for(i <- 1 to 10 reverse){
      println(i)
    }



    //嵌套循环
    println("------------")
    for(i <- 1 to 5 ; j <- 1 to 3){
      println("i:"+i+",j:"+j)
    }

    //输出九九乘法表
    println("------------")
    for( i <- 1 to 9){
      for(j <- 1 to i){
        print(s"${j} * ${i} = ${i*j} \t")
      }
      println()
    }


  }
}
