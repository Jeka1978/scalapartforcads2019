package quoters

/**
  * @author Evgeny Borisov
  */
object QuoterAggregator {


  val quoters:List[Quoter] =List(new ShakespearQuoter(),MessageQuoter("bad to die"),RandomQuoter)



  def printQuoters():Unit={
    quoters.foreach(_.printMessage())
  }

  def main(args: Array[String]): Unit = {
    printQuoters
  }
}
