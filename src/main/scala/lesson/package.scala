/**
  * @author Evgeny Borisov
  */
package object lesson {

  class A(x:Int){
    val name:String="java"
  }
  class B(y:Double) extends A(y.toInt)

  object C{
    new A(2).name
  }
}
