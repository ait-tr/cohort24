package homework_42;

// Необходимо создать собственное исключение `InvalidEmail`.
public class InvalidEmail extends IllegalArgumentException {

  public InvalidEmail(String email) {
    super("Некорректный e-mail: " + email);
  }
}
