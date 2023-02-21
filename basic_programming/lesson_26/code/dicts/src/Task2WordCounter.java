import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Task2WordCounter {

  // прочитать количество слов
  // прочитать слова, каждое с новой строки
  // вывести пары: слово и количество его повторений
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    Map<String, Integer> wordCounter = new HashMap<>();
    for (int i = 0; i < n; ++i) {
      String word = br.readLine();
      if (wordCounter.containsKey(word)) {
        int counter = wordCounter.get(word); // getOrDefault()
        wordCounter.put(word, counter + 1);
      } else {
        wordCounter.put(word, 1); // добавляем счётчик для нового слова
      }
    }
    System.out.println(wordCounter);
  }
}
