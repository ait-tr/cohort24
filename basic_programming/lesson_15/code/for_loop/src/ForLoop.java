import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForLoop {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String line = br.readLine(); // строка, которую нужно повторять;
    int total = Integer.parseInt(br.readLine()); // натуральное число - количество повторений.

    int counter = 0; // счётчик, начальное значение
    while (counter < total) { // проверка счётчика
      System.out.println(line);
      ++counter; // counter = counter + 1; шаг счётчика
    }

    // for (начальное_выражение; условие; шаг) - цикл for объединяет в себе три команды сразу
    // шаг выполнится ПОСЛЕ {тела цикла}
    for (int i = 0; i < total; ++i) { // i - потому что индекс - переменная цикла
      // здесь переменная i есть, и её можно использовать или выводить
      // здесь её НЕ СТОИТ менять, цикл это допустит и выполнит шаг уже с изменённой переменной
      System.out.println(line);
    }
    // здесь ещё есть переменная counter, но уже нет переменной i

    // Так тоже бывает (любой компонент, кроме условия, можно пропустить):
    int k = 0;
    for (; k < total;) {
      System.out.println(line);
      ++k;
    }

    // Цикл без арифметики, так тоже можно:
    for (String s = "mama"; !s.isEmpty(); s = s.substring(1)) {
      System.out.println(s);
    }
  }
}
