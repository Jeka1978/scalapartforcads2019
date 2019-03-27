package animals

/**
  * @author Evgeny Borisov
  */
trait Animal {

  init()


  private def init(): Unit = {
    makeVoice()
  }

  def makeVoice(): Unit
}
