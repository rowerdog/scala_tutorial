package chapter04

/**
  * @ClassName: Test03_lambda
  * @Description
  * @Author gengmb on 2021/8/27 9:22
  * @Version: 1.0
  */
object Test03_lambda {
  def main(args: Array[String]): Unit = {
    //函数的高级用法





    def f(func: String => Unit): Unit = {
      func("fuck")
    }

    f((name:String) => {
      println(name)
    })

    f(name => println(name))
    //方法引用
    f(println)
    //如果参数在后面只出现一次，可以使用_
    f(println(_))

    //定义一个操作两个数的函数，具体操作由传入的参数指定
    def funTwoNumber(fun:(Int,Int)=>Int): Int ={
      fun(1,2)
    }
    val add = (a: Int,b: Int)=>a+b
    val minus = (a: Int,b: Int)=>a-b
    println(funTwoNumber(add))
    println(funTwoNumber(minus))

    println(funTwoNumber((a,b)=>a+b))
    println(funTwoNumber(_+_))



  }
}
