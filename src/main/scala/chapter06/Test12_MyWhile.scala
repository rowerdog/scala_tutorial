package main.scala.chapter06

/**
  * @ClassName: Test12_MyWhile
  * @Description
  * @Author gengmb on 2021/9/3 15:55
  * @Version: 1.0
  */
object Test12_MyWhile {
  def main(args: Array[String]): Unit = {


    def myWhile(condition: =>Boolean): (=>Unit)=>Unit ={
      def doloop(op: =>Unit):Unit = {
        if(condition){
          op
          myWhile(condition)(op)
        }

      }
      doloop
    }
    var n = 10
    myWhile(n>=1){
      n-=1
      println(n)
    }

    //柯里化实现

    def myWhile2(condition: =>Boolean)(op: =>Unit):Unit = {
      if(condition){
        op
        myWhile2(condition)(op)
      }
    }


  }
}
