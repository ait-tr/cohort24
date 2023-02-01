import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework11_1_1 {
  // Написать программу, в которую вводится имя и фамилия пользователя в одну строку через пробел.
  //
  // Программа должна выводить имя и фамилию на разных строках.
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                                       0123456789
    String fullName = br.readLine(); // "Кирилл Шнырев"
    int space = fullName.indexOf(' '); // находим индекс первого пробела - 6
    String firstName = fullName.substring(0, space);
    String lastName = fullName.substring(space + 1);
    // Возвращает строку, которая является подстрокой этой строки. Подстрока начинается с
    // символа по указанному индексу и продолжается до конца этой строки.
    // Примеры:
    //    0123456
    //   "unhappy".substring(2) возвращает "happy"
    //    01234567
    //   "Harbison".substring(3) возвращает "bison"
    //    012345678
    //   "emptiness".substring(9) возвращает "" (пустую строку)

    System.out.println(firstName);
    System.out.println(lastName);
  }
}
