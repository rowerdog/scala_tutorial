package main.scala.chapter07

/**
  * @ClassName: Test16_TraitSelfType
  * @Description
  * @Author gengmb on 2021/9/8 11:05
  * @Version: 1.0
  */
object Test16_TraitSelfType {
  def main(args: Array[String]): Unit = {
    val user = new RegisterUser("bing","123456")
    user.insert()
  }
}


class User(val name: String,val password: String)

trait UserDao{
  //传入一个类
  //没有继承关系，传入类的一个实例
  _: User =>

  def insert(): Unit ={
    println(s"insert into db ${this.name} ${this.password}")
  }
}

class RegisterUser(name: String,password: String) extends User(name,password) with UserDao
