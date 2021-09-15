package main.scala.chapter08

/**
  * @ClassName: Test17_CommonWordCount
  * @Description
  * @Author gengmb on 2021/9/15 10:00
  * @Version: 1.0
  */
object Test17_CommonWordCount {
  def main(args: Array[String]): Unit = {

    val stringlist = List(
      "hello",
      "hello scala",
      "hello spark from scala",
      "hello flink from scala"
    )
    //将步骤进行拆分，每一步写清楚思路


//    val wordList1 = stringlist.map(_.split(" "))
    //val flattenlist = wordList1.flatten
    //println(flattenlist)


    //1.将句子进行拆分，拆成一个一个的单词

    //2.然后将获得的List[Array[String]]，扁平化为List[String]
    //直接使用flatmap

    val flattenlist = stringlist.flatMap(_.split(" "))
    println(flattenlist)

    //3.对单词进行分组

    val grouplist = flattenlist.groupBy(word => word)
    println(grouplist)

    //4.对分组的list去长度，得到每个单词的个数

    //  lambda表达式就是传入一个参数，然后对参数做操作
    //这里传入键值对，然后改变键值对为  (单词,个数)
    val countmap = grouplist.map(kv => (kv._1,kv._2.length))
    println(countmap)
    //grouplist.reduce()

    //5.将map转换为list，并排序取前3
    //按照元组的第二个元素进行降序排序sortwith
    //取前3名  take
    val sortlist: List[(String, Int)] = countmap.toList
      .sortWith(_._2 > _._2)
      .take(3)

    println(sortlist)







  }
}
