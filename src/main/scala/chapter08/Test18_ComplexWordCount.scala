package main.scala.chapter08

/**
  * @ClassName: Test18_ComplexWordCount
  * @Description
  * @Author gengmb on 2021/9/15 13:30
  * @Version: 1.0
  */
object Test18_ComplexWordCount {
  def main(args: Array[String]): Unit = {
    val tuplelist: List[(String,Int)] = List(
      ("hello",2),
      ("hello scala",3),
      ("hello spark from scala",2)
    )

    //1.普通处理
    val stringlist = tuplelist.map(
      kv => {
        (kv._1 + " ") * 2
      }
    )
    println(stringlist)

    val countlist = stringlist
      .flatMap(_.split(" ")) //扁平化输出
      .groupBy(word => word) //按照单词分组
      .map(kv => (kv._1, kv._2.length)) //将分组转化为(k,k.size)
      .toList                         //转化为list
      .sortWith(_._2 > _._2)          //按照次数排序
      .take(3)                        //取前3名
    println(countlist)


    //思路二：对预统计的结果进行转换

    println("思路二")
    val preCountList = tuplelist.flatMap(
      tuple => {
        val strings = tuple._1.split(" ")
        strings.map(k => (k, tuple._2))
      }
    )
    println(preCountList)

    //然后按照单词分组

    val grouplist = preCountList.groupBy(_._1)
    println(grouplist)

    //然后改变  K V 的对应关系
    //mapValues的意思是改变 map的value的值
    val countMap = grouplist.mapValues(
      //取list中每个元组的和
      tuplelist => tuplelist.map(_._2).sum
    )

    println(countMap)

    //对统计的结果转换为list，然后排序，然后输出前3

    val wordCountMap = countMap
      .toList
      .sortWith(_._2 > _._2)
      .take(3)
    println(wordCountMap)





  }
}
