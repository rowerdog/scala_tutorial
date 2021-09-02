package chapter02

/**
  * @ClassName: Test04_DataType
  * @Description
  * @Author gengmb on 2021/8/25 10:18
  * @Version: 1.0
  */
object Test04_DataType {
  def main(args: Array[String]): Unit = {
    //基本数据类型

    //Byte：-128 ~ 127
    val a: Byte = 127
    val b: Byte = -128

    //整数默认是int
    val c = 21

    //声明是L类型的变量需要在后面加上L，大写L比小写l更有辨识度
    val cc = 12L


    //idea报错，运行时不报错
    val a2: Byte = 10 + 20
    println(a2)

    val b1: Byte = 10
    val a3: Byte = (b1+20).toByte
    println(a3)

    //浮点类型

    val a4: Float = 21.0f

    val a5 = 21

    //字符

    val c1 = 'a'
    val c5 = '9'
    println(c1)
    val c2 = '\n'
    //转义字符\
    val c3 = '\\'
    println(c3)

    //\"

    val c4 = '\"'
    println(c4)

    //字符底层存储的是ASCII码
    val i1: Int = c1
    val i2: Int = c5
    println("c1:"+i1)
    println("c5:"+i2)


    //boolean类型

    val isTrue = true
    println(isTrue)



    //Unit：空返回值

    def fu(): Unit = {
      println ("ok")
    }

    val res = fu()
    println(res)

    //null


    //nothing
    def fu1(n: Int): Nothing = {
     throw new NullPointerException
    }

    //抛出异常的时候可以使用nothing

  }
}
