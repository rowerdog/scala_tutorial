package main.scala.chapter09

/**
  * @ClassName: Test02_MatchTypes
  * @Description
  * @Author gengmb on 2021/9/16 15:18
  * @Version: 1.0
  */
object Test02_MatchTypes {
  def main(args: Array[String]): Unit = {

    //1.匹配常量

    def describeConst(x: Any): String = x match {
      case 1 => "Num one"
      case "hello" => "String hello"
      case  '+' => "Char +"
      case _ => ""
    }

    println(describeConst(1))
    println(describeConst('+'))
    println(describeConst("gg"))


    println("=============================")
    //2.匹配类型
    def describeType(x: Any): String = x match {
      case i: Int => "Int type:" + i
      case s: String => "String type:"+s
      case list: List[String] => "List[String] type:"+list
      case array: Array[Int] => "Array[Int] type:"+array.mkString(",")
      case a => "something else:"+a
    }

    //有趣的现象，泛型擦除
    println(describeType(12))
    println(describeType("let's go"))

    //List(1, 2, 3, 4))也能输出，因为JVM做了泛型擦除，底层只能识别到List
    println(describeType(List(1, 2, 3, 4)))
    describeType(List("hi","how are you"))
    println(describeType(Array(1, 2, 3, 4)))

    //我觉得是不属于对象层次的，使用底层数组实现的
    println(describeType(Array("go","gogo")))

    println("=============================")

    for(arr <- List(
      Array(0),
      Array(0,1,0),
      Array(1,1,0),
      Array(2,3,5,7),
      Array("hello",20,30)
    )){
      val result = arr match {
        case Array(0) =>  "0"
        case Array(0,1) => "Array(0,1)"
        case Array(x,y) => "Array(x,y):"+x+y
        case Array(0,_*) => "以0开始的数组"
        case Array(x,1,y) => "中间为1的三元素数组"
        case _ => "something else"
      }
      println(result)
    }

    println("匹配列表")
    //匹配列表

    for(list <- List(
      List(0),
      List(1,0),
      List(0,0,0),
      List(1,1,0),
      List(88)
    )){

      val result = list match {
        case List(0) => "List(0)"
        case List(0,_*) => "List(0,_*)"
        case List(x,y) => "List(x,y)"
        case List(x,1,y) => "List(x,1,y)"
        case _ => "others"
      }
      println(result)
    }

    //列表的方式二

    println("列表的方式二")
    val list = List(1,2,99,999,900)
    val result = list match {
        //这里匹配的是三个以上元素的列表
      case d1 :: d2 :: rest => println(s"d1=$d1 d2=$d2 rest=:$rest")
      case _ => println("others")
    }
    println(result)


    //匹配元组
    println("==================")


    for(tuple <- List(
      (0,1),
      (0,1,0),
      (0,1,1),
      (1,23,56),
      ("hello",true,0.5)
    )){
      val result = tuple match {
        case (a,b) => ""+a+","+b
          //元组大小是定死的，所以使用_*会报错
        case (0,_) => "0,_"
        case (a,1,_) => "(a,1,_) " + a
        case _ => "others"
      }
      println(result)
    }



  }
}
