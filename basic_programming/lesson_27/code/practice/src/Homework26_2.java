import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Homework26_2 {

  // Вам дан словарь, состоящий из пар слов. Каждое слово является синонимом к парному ему слову.
  // Все слова в словаре различны.
  //
  // Для слова из словаря, записанного в последней строке, определите его синоним.
  //
  // ## Формат ввода
  // - в первой строке - количество пар в словаре
  // - в следующих строках - сами записи: первое слово (ключ) и второе слово (синоним), каждое
  // слово в отдельной строке
  // - в последней строке - слово, синоним для которого нужно вывести
  //
  // ## Пример ввода
  // 3
  // Hello
  // Hi
  // Bye
  // Goodbye
  // List
  // Array
  // Goodbye
  //
  // ## Пример вывода
  // Bye

  public static void main(String[] args) throws IOException {
    try {
      // словарь.keySet() - множество ключей
      // словарь.values() - множество значений
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      Map<String, String> synonyms = new HashMap<>();
      int n = Integer.parseInt(br.readLine());
      for (int i = 0; i < n; ++i) {
        String first = br.readLine();
        String second = br.readLine();
        synonyms.put(first, second);
      }
      String word = br.readLine();
      if (synonyms.containsKey(word)) {
        String synonym = synonyms.get(word);
        System.out.println(synonym);
      } else if (synonyms.containsValue(word)) {
        for (String first : synonyms.keySet()) {
          String second = synonyms.get(first);
          if (second.equals(word)) {
            System.out.println(first);
            break;
          }
        }
      } else {
        System.out.println("В словаре нет такого слова");
      }
    } catch (NumberFormatException e) {
      System.err.println("Неправильный формат числа: " + e.getMessage());
    }
  }
}
