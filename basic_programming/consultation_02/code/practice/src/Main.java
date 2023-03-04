import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// репозиторий с кодом этой программы:
// https://github.com/k-shnyrev/Consultation02/
public class Main {

  // уже готовый репозиторий - зачем и как
  // инструкция в теории к уроку 34
  // GitHub с файлами -- для удобства, готовые файлы оттуда можно скачать на компьютер
  // и продолжить "с этого места"

  // задачи с шахматами - один шаг на соседнюю клетку меняет координату на +/- 1
  // List<List<Integer>> для хранения клеток доски

  // подходы к решению задач +++
  // снизу вверх - от частного решения к общему с постепенным усложнением
  //  был в уроке 34 в последовательности коммитов

  // Map - remove, removeAll, clear
  // remove(ключ) - удалит конкретную пару из словаря
  // removeAll(наборКлючей) - удалит пары с такими ключами
  // clear() - очистит весь словарь

  // Условие
  // Дан список стран и городов каждой страны. Затем даны названия городов.
  // Для каждого города укажите, в какой стране он находится.

  // Пример входных данных:
  // 2
  // Russia Moscow Petersburg Novgorod
  // Germany Berlin Munich Hamburg
  // 3
  // Moscow
  // Munich
  // Novgorod

  // Пример выходных данных
  // Russia
  // Germany
  // Russia

  // Два варианта Map:
  // Map<String, List<String>> - страна: список городов
  // Map<String, String> - город: страна
  public static void main(String[] args) throws IOException {
    // сверху вниз - от общей идеи к конкретной реализации - требует опыта, но на собеседовании
    // будет очень большим плюсом -- как раз покажет наличие опыта
    // сразу пишете main, как будто у вас уже есть все нужные методы
    // когда пишете, тогда и выясняете, а какие методы вам понадобятся
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    Map<String, String> cities = readCities(bufferedReader);

    // продолжит читать из того же bufferedReader
    List<String> request = readRequest(bufferedReader);
    bufferedReader.close();

    // для базы городов cities и запроса request напечатает ответ
    printResponse(cities, request);
  }

  public static void printResponse(Map<String, String> cities, List<String> request) {
    for (String city : request) { // перебираем города в списке запросов
      System.out.println(cities.get(city)); // выводим страну-значение по городу-ключу
    }
  }

  // прочитает запрос - города, для которых надо найти страны
  public static List<String> readRequest(BufferedReader bufferedReader) throws IOException {
    // здесь нельзя создавать BufferedReader - при создании он читает файл "с начала",
    // а мне может потребоваться продолжать читать уже открытый файл
    // значит, он должен прийти "снаружи", как аргумент вызова
    List<String> request = new ArrayList<>();
    int n = Integer.parseInt(bufferedReader.readLine());
    for (int i = 0; i < n; ++i) {
//      String line = bufferedReader.readLine(); // Прочитали город для поиска
//      request.add(line); // добавили к запросу
      request.add(bufferedReader.readLine());
    }
    return request;
  }

  // прочитает входные данные - базу городов
  public static Map<String, String> readCities(BufferedReader bufferedReader) throws IOException {
    // здесь нельзя создавать BufferedReader - при создании он читает файл "с начала",
    // а мне может потребоваться продолжать читать уже открытый файл
    // значит, он должен прийти "снаружи", как аргумент вызова
    Map<String, String> result = new HashMap<>();
    int n = Integer.parseInt(bufferedReader.readLine());
    for (int i = 0; i < n; ++i) {
      String line = bufferedReader.readLine(); // line - строка входных данных
      // line = "Germany Berlin Munich Hamburg"
      // нам нужно разбить эти данные на страну и города
      // и все города перебирать по очереди
      int firstSpace = line.indexOf(' ');
      String country = line.substring(0, firstSpace); // страна - с начала до первого пробела
      String cities = line.substring(firstSpace + 1); // все города - после первого пробела
      // пока строка cities с городами не пустая, искать пробел и по нему "отрезать" город
      while (!cities.isEmpty()) {
        int spaceIndex = cities.indexOf(' ');
        if (spaceIndex != -1) { // пробел есть - в строке больше одного города
          String city = cities.substring(0, spaceIndex); // беру "первый" город в строке
          cities = cities.substring(spaceIndex + 1); // "отрезаю" взятый город
          result.put(city, country); // кладу пару "город - страна" в результат метода
        } else { // spaceIndex == -1, нет пробела, это последний город
          String city = cities; // беру всю строку - это последний город
          cities = ""; // очищаю строку cities, городов не осталось
          result.put(city, country); // кладу пару "город - страна" в результат метода
        }
      }
    }
    return result;
  }
}
