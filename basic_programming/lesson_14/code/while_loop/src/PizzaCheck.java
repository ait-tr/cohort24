import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PizzaCheck {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Выберите размер пиццы: S - маленькая, L - большая");
    String size = br.readLine().toUpperCase(); // если ввели "s", сделаем "S"
    // размер не равен S И  размер не равен L -- значит, ввели что-то ещё
    // !size.equals("S") && !size.equals("L")

    // (размер равен "S" ИЛИ размер равен "L") - всё хорошо
    // НЕ (размер равен "S" ИЛИ размер равен "L") - всё плохо
    // !(size.equals("S") || size.equals("L"))
    while (!(size.equals("S") || size.equals("L"))) {
      System.out.println("Неправильный размер пиццы!");
      System.out.println("Выберите размер пиццы: S - маленькая, L - большая");
      size = br.readLine().toUpperCase(); // если ввели "s", сделаем "S"
    }

    // Это уже не про цикл
    // true - маленькая, false - большая -- МЫ САМИ ЭТО ПРИДУМАЛИ
    // если не маленькая, то большая
    boolean small = size.equals("S");
    // size равен "S" -- small = true
    // size равен "L" -- size не равен "S" -- small = false
  }
}
