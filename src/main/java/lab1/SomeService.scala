package lab1

/**
  * @author Evgeny Borisov
  */
class SomeService(var repeat:Int) {

  init()

  def apply(x:Int):String={
    x.toString
  }

  def init(): Unit ={
    println("some service was instatiated")
    val ints = List.apply(1,2,3)
  }

  def printMe():Unit={
    for (i <- 1 to repeat ) println("I'm the best sevice which do nothing")
  }

}
