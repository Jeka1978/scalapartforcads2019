package hm1

import org.junit.{Assert, Test}

/**
  * @author Evgeny Borisov
  */
class LoginTest {


  @Test
  def testAdminCantBeUserName(): Unit = {
    val login = NewLogin("admin", "bla", "bla")
    val message: String = LoginValidator.validate(login)
    Assert.assertEquals(LoginValidator.ADMIN_IN_USERNAME,message)
  }

  @Test
  def testPasswordCantStartFromLetterZ(): Unit = {

    val login = NewLogin("bla", "z123", "z123")
    val message: String = LoginValidator.validate(login)
    Assert.assertTrue(message.contains(LoginValidator.Z_CANT_BE_FIRST_IN_PASSWORD))
  }


  @Test
  def testPasswordCantbeEqualToUserName(): Unit = {
    val login = NewLogin("bla", "bla", "bla")
    val message: String = LoginValidator.validate(login)
    Assert.assertEquals(LoginValidator.USER_EQ_PASSWORD, message)
  }

  @Test
  def testPasswordCantContainOnlyDigits(): Unit = {
    val login = NewLogin("bla", "123456", "bla")
    val message: String = LoginValidator.validate(login)
    Assert.assertTrue(message.contains(LoginValidator.ONLY_DIGITS_IN_PASSWORD))
  }
  @Test
  def testPasswordEqualToConfirmation(): Unit = {
    val login = NewLogin("Anatoliy", "bla", "bla2")
    val message: String = LoginValidator.validate(login)
    Assert.assertTrue(message.contains(LoginValidator.PASSWORD_NOT_EQUAL_CONFIRMATION))
  }

  @Test
  def testCorrectLogin(): Unit = {
    val login = NewLogin("bla", "bla2", "bla2")
    val message: String = LoginValidator.validate(login)
    Assert.assertEquals( LoginValidator.OK,message)
  }




}





