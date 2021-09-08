package main.scala.chapter07

/**
  * @ClassName: Test14_TraitMixin
  * @Description
  * @Author gengmb on 2021/9/8 9:58
  * @Version: 1.0
  */
object Test14_TraitMixin {
  def main(args: Array[String]): Unit = {
    val student = new Student14
    student.dating()
    student.increase()


    //动态混入
    //动态实现特征
    val studentWithTalent = new Student14 with Talent{
      override def singing: Unit = {
        println(s"$name good at singing")
      }

      override def dancing: Unit = {
        println(s"$name good at dancing")
      }
    }
    studentWithTalent.singing
    studentWithTalent.dancing
  }
}

trait Knowledge{
  var amount: Int = 0
  def increase(): Unit
}

trait Talent{
  def singing
  def dancing
}

class Student14 extends Person13 with Young with Knowledge{
  //重写冲突的属性
  override val name: String = "student"

  //实现抽象方法
  def dating(): Unit = {
    println(s"name: $name is dating")
  }

  //自己的方法

  def study(): Unit ={
    println(s"student $name is studying")
  }

  //重写父类方法
  override def sayHello(): Unit = {
    super.sayHello()
    println(s"hello from student $name")
  }

  override def increase(): Unit = {
    amount+=1
    println(s"$name knowledge increased: $amount")
  }
}
