import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Task0Dict {

  // строка - есть порядок (символов), нельзя менять элементы и размер
  // массив[] - есть порядок, нельзя менять размер
  // список - List - есть порядок, можно добавлять и удалять элементы
  // множество - Set - нет порядка, нельзя повторять элементы
  // словарь - Map - множество пар "ключ-значение"
  // как в обычном толковом словаре: ключ - слово, а значение - определение
  // все ключи подчиняются таким же правилам, как и элементы множества:
  // ключи не могут повторяться и у них нет порядка
  // значение может быть любым - хоть списком
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // количество дней в месяце по названию месяца
    // Map<ТипКлюча, ТипЗначения> названиеСловаря = new HashMap<>();
    Map<String, Integer> months = new HashMap<>();
    // добавить элемент - put(key, value)
    // повторное добавление с таким же ключом ЗАТРЁТ предыдущую запись
    months.put("january", 31);
    months.put("february", 28);
    months.put("march", 31);
    months.put("april", 30);
    // ...

    System.out.println("Введите название месяца:");
    String monthTitle = br.readLine();
    // проверить, есть ли такой ключ - словарь.containsKey(ключ)
    // проверить, есть ли такое значение - словарь.containsValue(значение)
    if (!months.containsKey(monthTitle.toLowerCase())) {
      System.err.println("Не знаю такого месяца - " + monthTitle + "!");
      return;
    }
    // получить значение по ключу
    // ТипЗначения переменная = словарь.get(ключ)
    int days = months.get(monthTitle.toLowerCase());
    System.out.println("В месяце " + monthTitle + " - " + days + " дней");
  }
}
