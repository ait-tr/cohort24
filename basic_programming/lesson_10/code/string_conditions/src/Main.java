import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Привет! Как тебя зовут?");
    String name = br.readLine();
    // примитивные типы (числа, char, boolean) сравниваем через операторы сравнения
    // для ссылочных типов операторы сравнения ВСЕГДА сравнивают адреса ССЫЛОК
    // Значит, строки НЕЛЬЗЯ сравнивать через ==, !=, > и т.д.

    // У любых классов есть встроенный метод equals()
    // (для своих собственных классов его можно будет переделать)
    // строки (и любые другие Классы) сравниваем только через equals() и другие методы

    // equals(String) говорит, что строки равны, только если совпадает КАЖДЫЙ символ
    // если есть лишний пробел или какая-нибудь буква заглавная вместо строчной (и наоборот),
    // equals честно скажет, что строки НЕ РАВНЫ
    if (name.equals("Кирилл")) {
      System.out.println("О, моё любимое имя!");
    } else {
      System.out.println("Какое интересное имя!");
    }

    System.out.println("Как ты себя чувствуешь?");
    String mood = br.readLine();
    // метод toLowerCase() возвращает нам строку, где все буквы переделаны в строчные
    // метод toUpperCase() возвращает нам строку, где все буквы переделаны в заглавные
    // метод equalsIgnoreCase(String) сравнивает строки без учёта регистра
    // ему не важно, маленькие или большие буквы
    if (mood.equalsIgnoreCase("хорошо")) {
      System.out.println("И у меня хорошо!");
    } else if (mood.toLowerCase().contains("плохо")) {
      // метод contains(String) проверяет, есть ли в строке такая подстрока
      if (mood.toUpperCase().contains("НЕ")) { // для тренировки -- а так рекомендую везде lower
        System.out.println("Похоже, что всё не так уж и плохо!");
      } else { // есть "плохо", но нет "не"
        System.out.println("Сочувствую!");
      }
    } else { // во всех остальных случаях
      System.out.println("Интересно, расскажи подробнее?");
    }

    System.out.println("Твоё настроение было записано так: " + mood);
    // сама переменная mood не меняется -- строки нельзя менять
    // все toLower и прочее создают КОПИИ с другим регистром
  }
}
