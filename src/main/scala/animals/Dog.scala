package animals

import org.fluttercode.datafactory.impl.DataFactory

/**
  * @author Evgeny Borisov
  */
class Dog extends Animal with Runnable with Comparable[Dog]{
  override def makeVoice(): Unit = println("au au au")

  init()

  def init(): Unit ={
    println("dog was created")
  }

  override def run(): Unit = {

  }

  override def compareTo(o: Dog): Int = {
    1
  }
}
