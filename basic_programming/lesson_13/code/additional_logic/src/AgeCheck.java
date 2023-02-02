import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AgeCheck {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Привет! Как тебя зовут?");
    String name = br.readLine();

    System.out.println("А сколько тебе лет?");
    int age = Integer.parseInt(br.readLine());

//    if (age < 18) {
//      System.out.println("Хмм...");
//    } else {
//      System.out.println("Приятно познакомиться!");
//    }
    // тернарный оператор
    // условие ? значение1 : значение2
    // тернарный оператор не бывает "сам по себе", полученное значение обязательно надо использовать
    // положить в скобочки к методу или записать в переменную
    System.out.println(age < 18 ? "Хмм..." : "Приятно познакомиться!");

    System.out.println("Всё, мне пора, пока!");
  }
}
