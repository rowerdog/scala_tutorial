package main.scala.chapter07

/**
  * @ClassName: Test15_TraitOverlying
  * @Description
  * @Author gengmb on 2021/9/8 10:21
  * @Version: 1.0
  */
object Test15_TraitOverlying {
  def main(args: Array[String]): Unit = {
    val student = new Student15
    //输出Talent15 increased
    //也就是说特征叠加时，重写的是最后一个特征
    student.increase()
  }
}

trait Knowledge15{
  var amount: Int = 0
  def increase(): Unit ={
    println("knowledge increased")
  }
}

trait Talent15{
  def singing
  def dancing
  def increase(): Unit ={
    println("Talent15 increased")
  }
}


class Student15 extends Person13 with Knowledge15 with Talent15{
  override def dancing: Unit = println("dancing")

  override def singing: Unit = println("singing")

  override def increase(): Unit = {
    super.increase()
  }
}