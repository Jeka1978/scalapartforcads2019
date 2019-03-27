package hm1

/**
  * @author Evgeny Borisov
  */
object LoginValidator {
  val OK = "accepted"

  val PASSWORD_NOT_EQUAL_CONFIRMATION = "password should be equal to confirmation"

  val ONLY_DIGITS_IN_PASSWORD = "password can;t contain only digits"

  val USER_EQ_PASSWORD = "username should be different from your password"

  val Z_CANT_BE_FIRST_IN_PASSWORD = "you can't start your password from 'z'"

  val ADMIN_IN_USERNAME = "admin can't be name of user"


  def validate(login: NewLogin): String = {

    login match {
      case NewLogin("admin", _, _) => ADMIN_IN_USERNAME
      case NewLogin(_, password, _) if password.startsWith("z") => Z_CANT_BE_FIRST_IN_PASSWORD
      case NewLogin(userName, password, _) if userName == password => USER_EQ_PASSWORD
      case NewLogin(_, password, _) if password.forall(_.isDigit) => ONLY_DIGITS_IN_PASSWORD + s" current password is ${password}"
      case NewLogin(_, password, confirmation) if password != confirmation => PASSWORD_NOT_EQUAL_CONFIRMATION + s" pass:$password confirmation: $confirmation"
      case _ => OK
    }

  }


}














