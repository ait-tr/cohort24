import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangle {

  // получить у пользователя длину и ширину прямоугольника
  // вывести прямоугольник из звёздочек (*)
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Введите ширину: ");
    int width = Integer.parseInt(br.readLine()); // 3
    System.out.print("Введите высоту: ");
    int height = Integer.parseInt(br.readLine()); // 2
    System.out.println(); // вывести пустую строку
    // ***
    // ***

    // rowN - номер строки
    for (int rowN = 0; rowN < height; ++rowN) { // вывести строки (height) раз
      // выводим строку - повторяем '*' (width) раз
      for (int colN = 0; colN < width; ++colN) {
        // выводим звёздочку в строке rowN и столбце colN
        System.out.print('*');
      }
      System.out.println(); // перейдёт на новую строку -- предыдущую только что заполнили
    }
  }
}
