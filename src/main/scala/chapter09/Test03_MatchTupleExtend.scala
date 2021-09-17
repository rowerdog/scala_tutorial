package main.scala.chapter09

/**
  * @ClassName: Test03_MatchTupleExtend
  * @Description
  * @Author gengmb on 2021/9/17 10:28
  * @Version: 1.0
  */
object Test03_MatchTupleExtend {
  def main(args: Array[String]): Unit = {
    //1.在变量声明时匹配

    val (x,y) = ("hello",1)
    println(x)

    val List(fi,se,_*) = List(1,2,3,4,5)

    println(fi)

    //另一种定义
    val fir :: sec :: rest = List(1,2,3,4,5)
    println(rest)

  }
}
