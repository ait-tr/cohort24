import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// Репозиторий с этим кодом и историей коммитов:
// https://github.com/k-shnyrev/Lesson34

public class Main {

  // Как известно, в США президент выбирается не прямым голосованием, а путем двухуровневого
  // голосования.
  // Сначала проводятся выборы в каждом штате, и определяется победитель выборов в данном штате.
  // Затем проводятся государственные выборы:
  // на этих выборах каждый штат имеет определенное число голосов — число выборщиков от этого штата.
  // На практике, все выборщики от штата голосуют в соответствии с результатами голосования внутри
  // штата, то есть на заключительной стадии выборов в голосовании участвуют штаты,
  // имеющие различное число голосов.

  // В первой строке дано количество записей.
  // Каждая запись содержит фамилию кандидата и число голосов,
  // отданных за него в одном из штатов.
  //
  // Подведите итоги выборов: для каждого из участников голосования
  // определите число отданных за него голосов.

  // Пример ввода:
  // 5
  // McCain 10
  // McCain 5
  // Obama 9
  // Obama 8
  // McCain 1

  // Пример вывода:
  // McCain 16
  // Obama 17
  public static void main(String[] args) throws IOException {
    File inputFile = new File("res/in.txt");
    Map<String, Integer> result = calculateResult(inputFile);

    File outputFile = new File("res/out.txt");
    printResult(result, outputFile);
  }

  public static Map<String, Integer> calculateResult(File inputFile) throws IOException {
    Map<String, Integer> result = new HashMap<>();
    try {
      BufferedReader br = new BufferedReader(new FileReader(inputFile)); // ошибка, если файла нет

      int n = Integer.parseInt(br.readLine()); // ошибка, только если файл неправильный
      for (int i = 0; i < n; ++i) { // прочитать n раз
        String line = br.readLine(); // "McCain 10"
        int spaceIndex = line.lastIndexOf(' '); // индекс пробела (для "McCain 10" это 6)
        // с начала и до пробела - имя
        String name = line.substring(0, spaceIndex); // "McCain" // ошибка, если файл неправильный
        // строка с числом голосов - от "после пробела" до конца
        String voiceStr = line.substring(spaceIndex + 1); // "10"
        int voices = Integer.parseInt(voiceStr); // 10 // ошибка, если файл неправильный

        if (!result.containsKey(name)) { // если кандидат появляется впервые
          result.put(name, 0); // создаём ему счётчик
        }
        result.put(name, result.get(name) + voices); // увеличиваем счётчик на значение голосов
      }
      br.close();
    } catch (FileNotFoundException e) {
      System.err.println("Файл не найден: " + e.getMessage());
    } catch (IndexOutOfBoundsException e) {
      // если при поиске пробела получили -1 и подставили его в substring
      System.err.println("Ошибка в файле: в строке нет пробела между именем и голосами");
    } catch (NumberFormatException e) {
      System.err.println("Ошибка в файле: количество голосов записано неверно: " + e.getMessage());
    }
    return result;
  }

  public static void printResult(Map<String, Integer> result, File outputFile) throws IOException {
    try {
      FileWriter outputFileWriter = new FileWriter(outputFile);
      for (String name : result.keySet()) {
        outputFileWriter.write(name + " " + result.get(name) + "\n");
      }
      outputFileWriter.close();
    } catch (FileNotFoundException e) {
      System.err.println("Не найдена директория для выходного файла: " + e.getMessage());
    }
  }
}
