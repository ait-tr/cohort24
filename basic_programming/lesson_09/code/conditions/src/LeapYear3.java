import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYear3 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // год, который делится на 4 -- високосный
    // 2020, 2024 -- високосный
    // но при этом год, который делится на 100 -- не високосный
    // 1900, 2100 -- не високосный
    // но при этом год, который делится на 400 -- високосный
    // 1600, 2000, 2400 -- високосный

    System.out.print("Введите год: ");
    int year = Integer.parseInt(br.readLine());
    if (year < 0) {// условие-стражник (guardian condition): не пропустит программу дальше
      // фейс-контроль
      System.out.println("Нельзя вводить отрицательный год!");
      return; // досрочное завершение метода -- всего main(), то есть всей программы
    }

    if (year % 400 == 0) {        // самое важное условие
      System.out.println(year + " -- високосный год!");
    } else if (year % 100 == 0) { // else if - иначе если - по очереди проверяем условия
      System.out.println(year + " -- не високосный год!");
    } else if (year % 4 == 0) {   // в порядке приоритета, при выполнении условия всё заканчивается
      System.out.println(year + " -- високосный год!");
    } else {                      // последнее убежище -- во всех остальных случаях
      System.out.println(year + " -- не високосный год!");
    }
  }
}
