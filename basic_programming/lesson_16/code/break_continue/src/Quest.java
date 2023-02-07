import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quest {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("=== Текстовый квест v 0.0.1 ===");
    System.out.println();

    System.out.println("Для выхода введите 'q'.");

    // do - делай
    // while - пока
    // делай {команды} пока (выполняетсяУсловие)
    String name;
    do {
      System.out.print("Назови своё имя: ");
      // метод .trim() обрезает пустое пространство в начале и в конце строки
      // "   Hello world!  ".trim()   -->   "Hello world!"
      // пустое пространство -- пробелы ' ', конец строки '\n' и табуляция '\t'
      // "        ".trim()            -->   ""
      name = br.readLine().trim();
      if (name.isEmpty()) {
        System.out.println("Имя не может быть пустым!");
      }
    } while (name.isEmpty());

    if (name.equals("q")) {
      System.out.println("Прощай, безымянный путник!");
      return;
    }

    System.out.println("Добро пожаловать, " + name + "!");

    boolean upaliKamni = false; // первый проход завален - в начале игры это ложь
    boolean golovaCelaya = true;

    // бесконечный "основной игровой цикл"
    while (true) {
      System.out.println("""
          
          Ты стоишь в тёмной пещере.
          Перед тобой три прохода: прямо, налево и направо.
          
          Куда пойдёшь?""");

      System.out.print("Введи команду: ");
      String line = br.readLine().toLowerCase();

      if (line.equals("q") || line.equals("quit") || line.equals("exit") || line.equals("выход")) {
        break; // выход из основного игрового цикла
      }

      switch (line) {
        case "вперёд", "прямо" -> {
          if (!upaliKamni) { // камни ещё не упали -- это первое посещение
            System.out.println("""
                Ты попробовал смело шагнуть вперёд.
                Раздался ужасный грохот, и потолок обвалился - проход завален.
                Ты успел отпрыгнуть на исходную позицию, но щёку рассекло обломком.""");
            upaliKamni = true; // теперь камни упали -- это было первое посещение
          } else {
            // камни УЖЕ упали -- это не первая попытка
            System.out.println("Проход завален. Туда не пройти.");
          }
        } // выход из switch, не влияет на основной игровой цикл
        case "налево" -> {
          System.out.println("""
              Ты поворачиваешь налево и осторожно шагаешь.
              Осторожность тебя не спасла - в темноте пропасть.
              [СМЕРТЬ]""");
          return; // досрочный выход из всей программы вообще
        }
        case "направо:" -> {
          System.out.println("""
              Ты увидел свет в правом проходе и шагнул туда.
              После недолгого путешествия по тоннелю ты выбрался на свободу, где тебя ждал...
              Настоящий мангал и термосумка с холодными напитками!
                            
              И тут зазвенел будильник. Пора на работу!
              """);
          return;
        }
        case "подпрыгнуть", "вверх" -> {
          if (golovaCelaya) {
            System.out.println("Ага, и полететь, да? Нет уж! (Ты набил шишку)");
            golovaCelaya = false; // голова больше не целая
          } else {
            System.out.println("А ты необучаемый, да? Головой ударился, что ли? Ах да...");
          }
        }
        case "назад" -> System.out.println("Герои не поворачивают назад!");
        default -> System.out.println("Нет такой команды :(");
      }
    }
  }
}
