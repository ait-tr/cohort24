public class ForEven {

  public static void main(String[] args) {
    // программа, которая выведет все чётные числа от 1 до 100

    System.out.println("Чётные числа от 1 до 10:");
    // 2 - первое чётное в этом диапазоне
    // 2 - шаг между чётными числами
    for (int num = 2; num <= 10; num += 2) {
      // здесь только чётные числа от 2 до 100
      System.out.println(num);
    }
    System.out.println();

    System.out.println("Чётные числа от 1 до 10:");
    int begin = 1;
    int end = 10;
    for (int num = begin; num <= end; ++num) {
      // здесь все числа от begin до end
      if (num % 2 == 0) {
        System.out.println(num); // а здесь только чётные
      }
    }
    System.out.println();

    System.out.println("Чётные числа от 1 до 10:");
    for (int num = begin; num <= end; ++num) {
      // здесь все числа от begin до end
      if (num % 2 != 0) {
        continue; // пропустить нечётные
      }
      System.out.println(num); // а здесь только чётные
    }
  }
}
