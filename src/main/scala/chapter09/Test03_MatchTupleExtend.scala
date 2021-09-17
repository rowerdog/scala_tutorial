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


    //2.在for推导式中进行模式匹配

    println("==================================")
    val list = List(("a",12),("b",56),("c",88),("a",99))

    //2.1普通推导
    for(elem <- list){
      println(elem._1+" "+elem._2)
    }

    //2.2 定义为元组，赋值
    for((word,count) <- list){
      println(word+" "+count)
    }

    //2.3不考虑每个位置的变量，只遍历key或者value
    println("---------------------------------")
    for((word,_) <- list){
      println(word)
    }

    //2.4指定位置元素
    println("---------------------------------")
    for(("a",word) <- list){
      println(word)
    }


  }
}
