package chapter02

/**
  * @ClassName: Test05_DataTypeConversion
  * @Description
  * @Author gengmb on 2021/8/25 13:31
  * @Version: 1.0
  */
object Test05_DataTypeConversion {
  def main(args: Array[String]): Unit = {
    //(short,byte) 和char不能自动转换


    //Byte、Short、Char 之间做计算，不论是Byte和Short之间，
    // 还是Byte和Char、Char和Short 必须要先自动类型提升到Int
    val b1: Byte = 1

    val a1: Short = 2

    val c1: Int = a1 + b1
    println(c1)
    //String和Int类型之间的转换
    //
    val t: Int = "123.5".toDouble.toInt


    //强制类型转换的精度缺失和溢出的问题
    //
    //1000 0010的原码
    //    |
    //   < >
    //1111 1110
    val t1: Int = 130
    val t2: Byte = t1.toByte
    println(t2)

  }
}
