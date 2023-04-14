import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    // создание
    int[] numbers = /*new int[]*/{1, 2, 3, 4, 5};
    System.out.println("Список чисел:");
    for (int x : numbers) {
      System.out.println(x);
    }

    // изменение
    for (int i = 0; i < numbers.length; ++i) {
      numbers[i] *= numbers[i];
    }

    System.out.println("Список квадратов чисел:");
    // потребление
    for (int x : numbers) {
      System.out.println(x);
    }

    System.out.println("Список квадратов чисел из потока:");
    Stream.of(1, 2, 3, 4, 5)    // создание
        .map(x -> x * x)                // изменение
        .forEach(Main::strangePrint);   // потребление
    // класс::метод -- ссылка на метод (method reference)
    // именно так можно передавать метод аналогично лямбда-функции - теперь это НЕ анонимная функция
  }

  public static void strangePrint(int x) {
    System.out.println("-=" + x + "=-");
  }
}
