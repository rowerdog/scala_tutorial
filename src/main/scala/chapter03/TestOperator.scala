package chapter03

/**
  * @ClassName: TestOperator
  * @Description
  * @Author gengmb on 2021/8/25 14:49
  * @Version: 1.0
  */
object TestOperator {
  def main(args: Array[String]): Unit = {
    //1.算术运算符
    val res: Double = 10.0/3

    //格式化输出
    //总的位数是5位，保留两位小数
    //不够5位的话，前面空开
    println(res.formatted("%5.2f"))


    //2.比较运算符
    //和Java不同，比较的值相等
    val s1 = "hello"
    val s2 = new String("hello")
    println((s1 == s2))
    println(s1.equals(s2))

    //比较引用地址是否相等
    println(s1.eq(s2))


    //3.逻辑运算符
    //短路&&和按位与&
    def fork(): Boolean = {
      println("输出")
      return true
    }
    println(false&&fork())
    println(false&fork())

    //实际应用场景
    def isNotEmpty(str: String): Boolean = {
      return str!=null && !("".equals(str.trim))
    }

    //运算符的本质

    val a = 1;
    val b = 2;
    val c = (a.+(b))
    println(c)
  }
}
