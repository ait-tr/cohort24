public class Task2Fibonacci {

  public static void main(String[] args) {
    System.out.println("fibonacci(10) = " + fibonacci(10));
  }

  /**
   * Поиск числа Фибоначчи
   *
   * @param n порядковый номер числа Фибоначчи
   * @return число Фибоначчи
   */
  public static int fibonacci(int n) {
    if (n < 3) { // для 1 и 2
      return 1;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}
