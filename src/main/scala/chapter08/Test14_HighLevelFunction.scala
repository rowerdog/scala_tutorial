package main.scala.chapter08

/**
  * @ClassName: Test14_HighLevelFunction
  * @Description
  * @Author gengmb on 2021/9/14 16:08
  * @Version: 1.0
  */
object Test14_HighLevelFunction {
  def main(args: Array[String]): Unit = {
    //高级函数部分

    val list = List(1,2,3,4,5,6,7)
    //1.过滤

    //选取偶数
    val evenlist = list.filter(_%2==0 )
    println(evenlist)

    //选取奇数

    println(list.filter(_ % 2 == 1))


    //2.map
    //每个数乘以2
    println(list.map(elem => elem * 2))
    println(list.map(_ * 2))

    println(list.map(x => x * x))


    //3.扁平化

    //铺开
    val nestlist: List[List[Int]] = List(List(1,2,3),List(4,5,6),List(7,8,9))

    println(nestlist.flatten)

    //4.扁平映射

    //将一组单词组拆分，然后输出单词列表
    val strings: List[String] = List("hello java","hello scala","hello jvm")
    val splitlist: List[Array[String]] = strings.map(_.split(" "))

    val flattenlist = splitlist.flatten
    println(flattenlist)

    //综合函数flatmap

    val flatmaplist = strings.flatMap(_.split(" "))
    println(flatmaplist)

    //5.分组 groupby
    val groupMap1 = list.groupBy(_ % 2)

    val groupMap2: Map[String,List[Int]] = list.groupBy(data => if(data % 2 ==0) "偶数" else "奇数")

    println(groupMap1)
    println(groupMap2)


    //给定一组词汇，按照首字母进行分类

    val wordList = List("china","america","alice","nash","korean")

    println(wordList.groupBy(_.charAt(0)))

  }
}
