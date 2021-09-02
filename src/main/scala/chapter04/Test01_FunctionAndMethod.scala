package chapter04

/**
  * @ClassName: Test01_FunctionAndMethod
  * @Description
  * @Author gengmb on 2021/8/26 9:12
  * @Version: 1.0
  */
object Test01_FunctionAndMethod {
  def main(args: Array[String]): Unit = {

    //定义在方法里面的叫函数
    def sayHi(name: String): Unit ={
      println(name+":hi")
    }
    sayHi("xiaoming")
    val wangxiaoming = Test01_FunctionAndMethod.sayHi("wangxiaoming")
    println(wangxiaoming)
  }


  //定义在对象或者类里面叫方法
  def sayHi(name: String): Unit = {
    println(name+"Hi")
  }

}
