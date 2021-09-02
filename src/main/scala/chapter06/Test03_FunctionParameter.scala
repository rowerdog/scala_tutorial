package main.scala.chapter06

/**
  * @ClassName: Test03_FunctionParameter
  * @Description
  * @Author gengmb on 2021/9/2 16:10
  * @Version: 1.0
  */
object Test03_FunctionParameter {
  def main(args: Array[String]): Unit = {

    //多个参数
    def f1(str: String*): Unit = {
      println(str)
    }

    f1("bing")
    f1("bing","bo")

    //多个参数一般写在最后

    def f2(str1: String,str2: String*): Unit = {
      println("str1:"+str1+" str2:"+str2)
    }
    f2("bing")
    f2("bing","bo")


    //带默认值的参数
    def f3(name: String = "alice"): Unit = {
      println(name)
    }
    f3()
    f3("bing")


    //带名的参数

    def f4(name: String="bing",age: Int): Unit = {
      println(s"${age}的${name}最好看")
    }

    f4(age=16,name="bing")
    f4(age=16)
  }
}
