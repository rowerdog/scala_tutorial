package main.scala.chapter09

/**
  * @ClassName: Test01_PatternMatchBase
  * @Description
  * @Author gengmb on 2021/9/16 13:24
  * @Version: 1.0
  */
object Test01_PatternMatchBase {
  def main(args: Array[String]): Unit = {
    //模式匹配

    val x:Int = 4

    val y = x match {
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case _ => "other"
    }
    println(y)

    val a = 15
    val b = 20

    def matchDualOp(op: Char) = op match {
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => a / b
      case '%' => a % b
      case _ => "input error"
    }

    println(matchDualOp('+'))
    println(matchDualOp('%'))

    println("============================")


    //模式守卫

    def abs(num: Int) ={
      num match {
        case i  if i >= 0 => i
        case i if i < 0 => -i
      }
    }

    println(abs(-5))
  }
}
