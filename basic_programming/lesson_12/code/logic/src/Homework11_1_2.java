import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework11_1_2 {
  // Написать программу, в которую вводится имя и фамилия пользователя в одну строку через пробел.
  //
  // Программа должна выводить имя и фамилию на разных строках.
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String fullName = br.readLine();
    int space = fullName.indexOf(' ');

    // проверка корректности: других пробелов не должно быть
    int wrongSpace = fullName.indexOf(' ', space + 1);
    // второй пробел начинаем искать ПОСЛЕ первого (в строке он должен быть правее)
    if (wrongSpace != -1) { // мы нашли лишний пробел
      System.out.println("Некорректный формат ввода");
      return; // досрочно завершаем программу - продолжать смысла нет
    }

    String firstName = fullName.substring(0, space);
    String lastName = fullName.substring(space + 1);

    System.out.println(firstName);
    System.out.println(lastName);
  }
}
