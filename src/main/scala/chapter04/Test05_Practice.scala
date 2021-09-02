package main.scala.chapter04

/**
  * @ClassName: Test05_Practice
  * @Description
  * @Author gengmb on 2021/8/30 19:46
  * @Version: 1.0
  */
object Test05_Practice {
  def main(args: Array[String]): Unit = {

    //练习1：定义一个匿名函数赋值给一个变量

    val fun = (a:Int,b:String,c:Char)=>{
      if(a ==0 && b =="" && c =='0'){
        false
      }
      else
        true
    }

    println(fun(0,"",'0'))
    println(fun(0,"",'1'))

    //练习2，考察函数作为返回值的情景
    def func(a:Int): String=>(Char=>Boolean) ={
      def f1(b: String): Char=>Boolean ={
        def f2(c: Char):Boolean = {
          if(a ==0 && b =="" && c =='0') false else true
        }
        f2
      }
      f1
    }
    println(func(0)("")('0'))
    println(func(0)("")('1'))

    //匿名函数简写
    def func1(a:Int): String=>(Char=>Boolean) ={
      b=>c=>{if (a == 0 && b == "" && c == '0') false else true}
    }



  }
}
