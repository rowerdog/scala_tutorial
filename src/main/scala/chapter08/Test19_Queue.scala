package main.scala.chapter08

import scala.collection.immutable.Queue
import scala.collection.mutable

/**
  * @ClassName: Test19_Queue
  * @Description
  * @Author gengmb on 2021/9/15 14:19
  * @Version: 1.0
  */
object Test19_Queue {
  def main(args: Array[String]): Unit = {
    val queue = new mutable.Queue[String]()
    //可变队列
    //入队列
    queue.enqueue("q1","q2","q3")

    val deStr = queue.dequeue()
    println(deStr)
    println(queue.dequeue())
    println(queue.dequeue())


    println("========================")
    //不可变队列
    val queue1 = Queue("a","b","c")
    println(queue1)

    //queue1本身不改变
    queue1.enqueue("a")
    println(queue1)


  }
}
