package main.scala

//定义一个包对象，和其他的object在chapter07的下面，所属同一层，所以其他的object
//可以使用这个包对象
package object chapter07 {
  val commonValue = "chapter07"
  def commonMethod() = {
    println(s"所属的包是${commonValue}")
  }
}
