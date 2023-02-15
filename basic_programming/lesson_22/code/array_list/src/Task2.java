import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
  // Коллекция - класс для работы с несколькими элементами
  // List (список) - коллекция элементов по порядку (с индексами - 0, 1...) - как массив или строка
  // ArrayList - список на основе массива
  // В отличие от массивов, МОЖЕТ МЕНЯТЬ РАЗМЕР

  // Создание:
  // массив - Тип[] переменная = new Тип[размер]
  // список - List<Тип> переменная = new ArrayList<>()

  // Размер:
  // массив.length
  // список.size() - сколько элементов там прямо сейчас; этот размер может меняться

  // Получить существующий элемент по его индексу
  // массив[индекс]
  // список.get(индекс)

  // Изменить существующий элемент с нужным индексом
  // массив[индекс] = значение
  // список.set(индекс, значение)

  // Добавить новый элемент в конец списка - список.add(значение)

  // Добавить новый элемент в середину списка - список.add(новыйИндекс, значение)
  // Добавить новый элемент в начало списка - список.add(0, значение)

  // Удалить элемент (индексы сдвинутся) - список.remove(индекс)

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Введите количество имён: ");
    int n = Integer.parseInt(br.readLine());

    List<String> names = new ArrayList<>();
    System.out.println("Введите " + n + " имён:");
    for (int i = 0; i < n; ++i) {
      System.out.print((i + 1) + ". "); // 0 -> 1
      names.add(br.readLine());
    }

    System.out.print("Введите номер имени для вывода: ");
    int numToPrint = Integer.parseInt(br.readLine());
    int iToPrint = numToPrint - 1;

    System.out.println(numToPrint + ". " + names.get(iToPrint));

    System.out.print("Хотите добавить имя? [y/n]: ");
    String answer = br.readLine();
    if (answer.equalsIgnoreCase("y")) {
      // Добавляем имя в массив
      names.add(br.readLine());
    }
  }
}
