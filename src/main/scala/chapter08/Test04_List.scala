package main.scala.chapter08

/**
  * @ClassName: Test04_List
  * @Description
  * @Author gengmb on 2021/9/13 16:07
  * @Version: 1.0
  */
object Test04_List {
  def main(args: Array[String]): Unit = {

    //1.创建列表
    println("创建列表")
    val list1 = List(10,45,67)
    println(list1)

    //2.访问元素

    println("访问元素")
    println(list1(1))
    list1.foreach(println)

    //3.添加元素
    println("添加元素")
    val newlist1 = list1 :+ 15
    val newlist2 = 15 +: list1
    //
    println("list1")
    println(list1)
    println(newlist1)
    println(newlist2)

    //4.添加元素2

    val list2 = Nil.::(12)
    println(list2)

    val list3 = 30 :: 12 :: 100 :: Nil
    println(list3)


    val list4 = list2 :: list3
    println(list4)

    //5.真正合并两个列表
    val list5 = list2 ::: list3
    println(list5)

    val list6 = list2 ++ list3
    println(list6)



  }
}
