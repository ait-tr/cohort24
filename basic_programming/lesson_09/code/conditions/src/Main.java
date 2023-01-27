import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Приведение форматирования кода в порядок
// Windows: Ctrl + Alt + L
// MacOS: Command + Option + L

public class Main {
  final public static int LEGAL_AGE = 18;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Введите возраст: ");
    int age = Integer.parseInt(br.readLine());

    // если условие выполнится, что-то сделать
//    if (условие) {
//      // команды, если условие верно
//    }

    // ветвление -- если условие выполнится, сделать что-то одно, а если не выполнится -- другое
//    if (условие) {
//      // команды, если условие верно
//    } else {
//      // команды, если условие неверно
//    }

    // else без if НЕ БЫВАЕТ!
    // "иначе" всегда для какого-то условия

    // в качестве условия после его вычисления должен оказаться boolean
    if (age >= LEGAL_AGE) { // если условие -- true
      System.out.println("Поздравляю, вы совершеннолетний(яя)!");
    } else { // иначе (то есть условие оказалось false) -- во всех остальных случаях
      System.out.println("А взрослые рядом есть?");
    }

    System.out.println("Мне надо бежать, пока!");
  }
}
