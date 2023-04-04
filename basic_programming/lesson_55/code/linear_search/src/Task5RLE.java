import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5RLE {

  // Run-length encoding (RLE) (aaabbcddddaaaaa = a3b2cd4a5)
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Введите строку для сжатия:");
    String input = br.readLine();
    StringBuilder result = new StringBuilder(); // класс для "изменяемых строк", почти коллекция

    Character prev = null; // предыдущий символ, в начале он null - его нет
    int counter = 0; // счётчик текущего символа
    for (int i = 0; i < input.length(); ++i) {
      Character c = input.charAt(i); // текущий символ
      if (!c.equals(prev)) { // если текущий не совпадает с предыдущим
        // значит, закончилось повторение предыдущего символа
        // сам предыдущий символ уже записан в строке при его появлении
        // нам, возможно, надо записать число его повторений
        if (counter > 1) { // 0 и 1 записывать не нужно
          result.append(counter);
        }

        result.append(c); // записываем текущий (не совпадающий) в результат
        prev = c;
        counter = 1; // 1 символ мы уже прочитали - символ стал "предыдущим"
        // String += String / char -- O(n) для ОДНОГО сложения
        // StringBuilder.append - O(1)
      } else {
        ++counter;
      }
    }
    // в цикле мы не записали количество повторений последнего символа - он ни разу не становился
    // "старым, не совпадающим"
    // При этом в counter записано правильное значение
    if (counter > 1) { // 0 и 1 записывать не нужно
      result.append(counter);
    }

    System.out.println("Промежуточный результат сжатия:");
    System.out.println(result/*.toString()*/);
  }
}
