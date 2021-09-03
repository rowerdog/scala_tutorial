package main.scala.chapter06

/**
  * @ClassName: Test05_Lambda
  * @Description
  * @Author gengmb on 2021/9/3 9:15
  * @Version: 1.0
  */
object Test05_Lambda {
  def main(args: Array[String]): Unit = {

    //匿名函数
    val fun = (name: String) => println(name)
    fun("bing")

    //定义一个函数，函数的参数是一个函数

    def f(func: String=>Unit): Unit = {
      func("bing")
    }
    f(fun)

    f((name: String)=>{println(name)})

    f(name => println(name))

    //如果参数只出现一次，则参数可以省略，且后面参数可以用_代替
    f(println(_))

    //函数的参数是一种类型的操作
    f(println)

    println("================")
    //定义一个函数，只操作1和2两个数，具体的操作由参数传入进来

    def dualFunctionOneAndTwo(func: (Int,Int)=>Int): Int={
      func(1,2)
    }

    val add = (a: Int,b: Int)=>a+b
    val minus = (a: Int,b: Int)=>a-b

    println(dualFunctionOneAndTwo(add))
    println(dualFunctionOneAndTwo(minus))
    println(dualFunctionOneAndTwo((a,b)=>a*b))

  }
}
