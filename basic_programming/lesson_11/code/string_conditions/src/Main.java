import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// boolean isEmpty() -- пустая ли строка?
// boolean startsWith(String) -- сравнивает начало строки с аргументом
// boolean endsWith(String) -- сравнивает конец строки с аргументом

// int indexOf(char) -- найти самый первый индекс этого символа; получится -1, если не нашли
// int indexOf(String) -- найти самый первый индекс этой подстроки; получится -1, если не нашли
// int indexOf(char, int fromIndex) -- как indexOf(char), но не с начала, а с fromIndex
// int indexOf(String, int fromIndex) -- как indexOf(String), но не с начала, а с fromIndex

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Привет! Как тебя зовут?");
    String name = br.readLine();

    if (name.toLowerCase().contains("лл")) {
      System.out.println("В твоём имени есть буквы 'лл'!");
    }

    if (name == "Кирилл") { // никогда не выполнится, сравниваются ссылки
      System.out.println("Моё любимое имя! (==)");
    }
    if (name.equals("Кирилл")) {
      System.out.println("Моё любимое имя! (equals)");
    }

    if (name.equalsIgnoreCase("Привет")) {
      System.out.println("Это не имя!");
    }

    if (name.isEmpty()) {
      System.out.println("Вы ничего не ввели!");
      System.out.println("Введите ещё раз:");
      name = br.readLine();
    }

    if (name.startsWith("Ааа")) {
      System.out.println("Какое необычное имя! Начинается аж на три буквы 'а'!");
    }

    if (name.toLowerCase().endsWith("ааа")) {
      System.out.println("Какое необычное имя! Заканчивается аж на три буквы 'а'!");
    }

    int firstB = name.toLowerCase().indexOf('б');
    if (firstB != -1) {
      System.out.println("Буква 'б' есть в твоём имени, индекс: " + firstB);
    } else {
      System.out.println("Буквы 'б' нет в твоём имени!");
    }

    int secondB = name.toLowerCase().indexOf('б', firstB + 1);
    if (secondB != -1) {
      System.out.println("Вторая буква 'б' есть в твоём имени, индекс: " + secondB);
    } else {
      System.out.println("Второй буквы 'б' нет в твоём имени!");
    }
  }
}
