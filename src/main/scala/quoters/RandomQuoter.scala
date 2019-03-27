package quoters

import com.github.javafaker.{Faker, GameOfThrones}

/**
  * @author Evgeny Borisov
  */
object RandomQuoter extends Quoter {

  val dataFactory: GameOfThrones = new Faker().gameOfThrones

  override def printMessage(): Unit = {
    println(dataFactory.quote())
  }
}
