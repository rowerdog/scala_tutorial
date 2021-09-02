package chapter02

/**
  * @ClassName: TestVariable
  * @Description
  * @Author gengmb on 2021/8/24 17:24
  * @Version: 1.0
  */
object TestVariable {
  def main(args: Array[String]): Unit = {
    //定义变量时不用指定变量类型，可以自动类型推断
    var a = 10;
    println(a)
    a = 20
    //a = "string"
    //定义好变量后，变量不能更改数据类型，说明是强数据类型

    //变量声明时，必须初始化值
    var name = "xiaoxiao"
    println(name)

    //尽量使用val（常量），不使用var（变量）
    //var修饰的可变，val修饰的不可变
    //val修饰的引用不可变，引用指向对象的内容可变

    val dollar = 10

    var `if` = "if"
    println(`if`)

    //*
    println("name"*3)

    //3.字符串模板，插值字符串，使用${变量}表示
    val age = 18
    println(s"${age}岁的${name} is ok")

    //格式化模板字符串
    val num = 0.345
    println(f"this num is ${num}%2.2f")

    //原生字符串
    println(raw"this num is ${num}%2.2f")

    //对多行字符串原样输出
    val sql =
      s"""
select *
from
  example
where
  name = 'sub'
and
  age = 18

     """.stripMargin
    println(sql)

  }
}
