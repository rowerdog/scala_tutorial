package main.scala.chapter09

/**
  * @ClassName: Test04_MatchTypes
  * @Description
  * @Author gengmb on 2021/9/17 13:48
  * @Version: 1.0
  */
object Test04_MatchTypes {
  def main(args: Array[String]): Unit = {
    //匹配对象实例
    val student = new Student("bing",12)

    student match {
      case Student("bing",12) => println("ok")
      case _ => println("else")
    }

  }



}

//定义样例类
case class Student(str: String, i: Int)
