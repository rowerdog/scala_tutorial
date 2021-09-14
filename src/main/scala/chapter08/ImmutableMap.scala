package main.scala.chapter08

/**
  * @ClassName: ImmutableMap
  * @Description
  * @Author gengmb on 2021/9/14 9:22
  * @Version: 1.0
  */
object ImmutableMap {
  def main(args: Array[String]): Unit = {


    //创建Map

    val map: Map[String,Int] = Map("a"->5,"hello"->6)

    println(map)
    println(map.getClass)

    //遍历元素
    map.foreach(println)

    map.foreach((kv:(String,Int)) => println(kv))

    for(key <- map.keys){
      println(s"$key ----> ${map.get(key)}")
    }

    //获得key的value
    println(map.get("a").get)
    //none
    println(map.get("c"))

    //0
    println(map.getOrElse("c",0))

    println(map("a"))
  }
}
