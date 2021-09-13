package main.scala.chapter08

import scala.collection.mutable.ArrayBuffer

/**
  * @ClassName: Test02_ArrayBuffer
  * @Description
  * @Author gengmb on 2021/9/13 14:27
  * @Version: 1.0
  */
object Test02_ArrayBuffer {
  def main(args: Array[String]): Unit = {

    val arr1 = new ArrayBuffer[Int]()

    val arr2 = ArrayBuffer(1,78,96)

    println(arr2.mkString(","))
    println(arr2)
    //相当于
    println(arr2.toString())


    //访问元素

    println("访问元素")
    println(arr2(1))
    arr2(1)=12
    println(arr2(1))

    //添加元素

    println("添加元素")
    //在后面添加
    val newArr = arr1 += 15

    println(arr1)
    println(newArr.eq(arr1))

    //在前面添加元素
    80 +=: newArr

    println(newArr)

    //推荐的用法
    arr1.append(100)
    arr1.prepend(888)
    arr1.insert(0,666)
    println(arr1)

    arr1.insertAll(1,newArr)
    arr1.appendAll(newArr)
    arr1.prependAll(newArr)

    //删除元素

    arr1.remove(3)
    arr1.remove(0,12)

    //可变数组转换为不可变数组

    println("数组之间的转换")
    println("可变数组转换为不可变数组")
    val arr: ArrayBuffer[Int] = ArrayBuffer(1,2,3,4)
    val newArr6 = arr.toArray
    println(arr)
    println(newArr6.mkString(","))

    //不可变数组转换为可变数组
    println("不可变数组转换为可变数组")
    println(newArr6.toBuffer)

  }
}
