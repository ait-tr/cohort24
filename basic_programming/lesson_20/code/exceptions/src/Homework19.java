import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework19 {
  // промежуток от 3 до 6
  // отрезок (closed interval): [3, 6]
  // - все числа от 3 до 6 включая (целые - 3, 4, 5, 6)
  // полуинтервал (half-open interval): [3, 6)
  // - все числа от 3 включая до 6 не включая (целые - 3, 4, 5)
  // полуинтервал (half-open interval): (3, 6]
  // - все числа от 3 не включая до 6 включая (целые - 4, 5, 6)
  // интервал (open interval): (3, 6) - все числа от 3 не включая до 6 не включая (целые - 4, 5)

  // Напиши метод `checkInterval`.
  // Метод должен проверять попало ли целое число в интервал от 50 до 100 и сообщить результат на
  // экран в следующем виде: "Число number не содержится в интервале." или
  // "Число number содержится в интервале.", где number — аргумент метода.
  // Метод НЕ ЧИТАЕТ число number, а получает его при вызове

  public static boolean checkInterval(int number) {
    if (50 < number && number < 100) {
      System.out.println("Число " + number + " содержится в интервале.");
      return true;
    } else {
      System.out.println("Число " + number + " не содержится в интервале.");
      return false;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    assert checkInterval(25) == false;
    assert checkInterval(50) == false : "checkInterval: Число 50 попало в интервал";
    assert checkInterval(51) == true;
    assert checkInterval(78) == true;
    assert checkInterval(100) == false: "checkInterval: Число 100 попало в интервал";
    assert checkInterval(120) == false;

    System.out.print("Введите число для проверки: ");
    int number = Integer.parseInt(br.readLine());
    checkInterval(number);
  }
}
