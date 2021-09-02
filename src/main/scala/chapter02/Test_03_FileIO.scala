package chapter02

import java.io.{File, PrintWriter, Writer}

import scala.io.Source

/**
  * @ClassName: Test_03_FileIO
  * @Description
  * @Author gengmb on 2021/8/25 9:06
  * @Version: 1.0
  */
object Test_03_FileIO {
  def main(args: Array[String]): Unit = {
    //读取文件
    Source.fromFile("src/main/resources/hello.txt").foreach(print)

    //写入文件
    val writer = new PrintWriter(new File("src/main/resources/output.txt"))
    writer.write("hello this is from china")
    writer.close()
  }
}
