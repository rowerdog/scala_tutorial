package main.scala.chapter06

/**
  * @ClassName: Test08_Practice
  * @Description
  * @Author gengmb on 2021/9/3 14:01
  * @Version: 1.0
  */
object Test08_Practice {
  def main(args: Array[String]): Unit = {

    val fun = (a:Int,b:String,c:Char)=>{
      if(a==0 && b=="" && c=='0')  true
      else
       false
    }
    println(fun(0, "", '0'))
    println(fun(0, "", '1'))

    println("=======================")
    def func(a:Int): String=>(Char=>Boolean)={
      def f1(b: String): Char=>Boolean ={
        def f2(c: Char): Boolean = {
          if(a==0 && b=="" && c=='0')  true
          else
            false
        }
        f2
      }
      f1
    }

    println(func(0)("")('0'))
    println(fun(0, "", '1'))


    //匿名函数不需要返回值
    def func2(a:Int): String=>(Char=>Boolean)={
      b=>c=>{if(a==0 && b=="" && c=='0')  true else false}
    }
    println(func(0)("")('0'))
    println(fun(0, "", '1'))


    //柯里化
    def func3(a: Int)(b: String)(c: Char): Boolean = {
      if(a==0 && b=="" && c=='0')  true else false
    }

  }
}
