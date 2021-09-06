package main.scala.chapter07

/**
  * @ClassName: Test06_ConstructorParams
  * @Description
  * @Author gengmb on 2021/9/6 14:27
  * @Version: 1.0
  */
object Test06_ConstructorParams {
  def main(args: Array[String]): Unit = {

    //测试无参构造器

    val student = new Student2
    println(s"无参构造器：name: ${student.name} age: ${student.age}")

    //测试有参构造器

    val student1 = new Student3("bing",16)
    println(s"有参构造器：name: ${student1.name} age: ${student1.age}")


    //
    val student5 = new Student5("bing",16)
    //error val
    //student5.age = 17
  }
}

//定义类
//无参构造器

class Student2{

  var name: String = _
  var age: Int = _
}

//推荐下面方法定义
class Student3(var name: String,var age: Int){

}

//参数无修饰
//无修饰，这里的参数只能是形参，不能成为类的属性
class Student4(name: String,age: Int){

  def printInfo(): Unit ={
    println(s"name: $name age: $age")
  }
}


class Student5(val name: String,val age: Int)