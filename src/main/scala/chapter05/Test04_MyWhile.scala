package main.scala.chapter05

/**
  * @ClassName: Test04_MyWhile
  * @Description
  * @Author gengmb on 2021/9/2 14:08
  * @Version: 1.0
  */
object Test04_MyWhile {
  def main(args: Array[String]): Unit = {

    var n = 10
    while(n >=1){
      println(n)
      n-=1
    }

    println("xxxxxxxxxxxxxxxxxxx")
    //传两个参数，一个状态，一个代码块
    def myWhile(condition: =>Boolean): (=>Unit)=>Unit ={
      def myLoop(op: =>Unit): Unit ={
        if(condition){
          op
          myWhile(condition)(op)
        }
      }
      myLoop
    }

    n = 10
    myWhile(n>=1)({
      println(n)
      n-=1
    })

    //def myWhile2()
  }
}
