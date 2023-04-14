public class Main {

  public static void main(String[] args) {
    int[] numbers = /*new int[]*/{1, 2, 3, 4, 5};
    System.out.println("Список чисел:");
    for (int x : numbers) {
      System.out.println(x);
    }

    for (int i = 0; i < numbers.length; ++i) {
      numbers[i] *= numbers[i];
    }
    System.out.println("Список квадратов чисел:");
    for (int x : numbers) {
      System.out.println(x);
    }
  }
}
