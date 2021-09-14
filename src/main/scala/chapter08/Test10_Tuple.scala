package main.scala.chapter08

/**
  * @ClassName: Test10_Tuple
  * @Description
  * @Author gengmb on 2021/9/14 10:50
  * @Version: 1.0
  */
object Test10_Tuple {
  def main(args: Array[String]): Unit = {

    //1.创建元组

    val tuple = ("scala",123,'a',true)
    println(tuple)
    println(tuple.getClass)

    //2.访问数据

    println(tuple._1)
    println(tuple._2)
    println(tuple._3)
    println(tuple._4)


    //3.遍历数据
    println("========================")
    for(elem <- tuple.productIterator){
      println(elem)
    }


    //4.嵌套元组

    println("========嵌套元组========")
    val tuple2 = ("scala",123,'a',true,("we","see","in","zhe","high"))
    println(tuple2._5._5)
  }
}
