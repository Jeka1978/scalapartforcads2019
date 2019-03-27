package quoters

/**
  * @author Evgeny Borisov
  */
class ShakespearQuoter(val message:String="2 B || ! 2 B") extends Quoter {
  override def printMessage(): Unit = {
    println(message)
  }
}
