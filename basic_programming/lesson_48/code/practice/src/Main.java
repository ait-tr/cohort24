import java.util.HashMap;
import java.util.Map;

public class Main {

  enum Command {
    CLOSE, // закрытие чека должно открыть следующий
    ADD, // добавить товар (строку) в чек
    REPORT, // вывести отчёт
  }

  private static final Map<Command, String> commands = new HashMap<>();
  static { // так можно задать статический константный словарь (Map)
    commands.put(Command.CLOSE, "Начать новый чек");
    commands.put(Command.ADD, "Добавить позицию в чек");
    commands.put(Command.REPORT, "Вывести отчёт");
  }

  // Тесты с подстановкой ввода и проверкой вывода:
  // Лучше всего делать метод, который результат ввода получает как аргумент,
  // а данные для вывода просто возвращает.
  // Такой метод проверять намного легче.

  // Задачка: написать кассовый аппарат.
  // Он должен уметь:
  // - открывать (начинать) чек
  // - добавлять товары (не из базы, а напрямую)
  // - закрывать чек и выводить общий итог
  // - выводить общий отчёт по чекам (с общей суммой):
  //   - сортировать чеки по количеству товаров
  //   - сортировать чеки по сумме чека
  public static void main(String[] args) {

  }
}