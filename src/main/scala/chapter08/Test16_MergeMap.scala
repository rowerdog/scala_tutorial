package main.scala.chapter08

import scala.collection.mutable

/**
  * @ClassName: Test16_MergeMap
  * @Description
  * @Author gengmb on 2021/9/15 9:48
  * @Version: 1.0
  */
object Test16_MergeMap {
  def main(args: Array[String]): Unit = {

    val map1 = Map("a"->1,"b"->2,"c"->3)
    val map2 = mutable.Map("a"->6,"b"->3,"c"->5)

    val map3 = map1.foldLeft(map2)(
      (mergeMap,kv) => {
        val key = kv._1
        val value = kv._2
        mergeMap(key) = mergeMap.getOrElse(key,0) + value
        mergeMap
      }
    )

    println(map3)

  }
}
