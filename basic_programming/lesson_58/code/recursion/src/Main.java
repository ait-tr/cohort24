public class Main {

  public static void main(String[] args) {
    printBin(19);
  }

  // алг printBin(цел n):
  //   если n=0 то выход все // условие выхода из рекурсии
  //   printBin ( div(n,2) ) // напечатать все цифры, кроме последней
  //   вывод mod(n,2) // вывести последнюю цифру
  public static void printBin(int n) {
    if (n == 0) {
      return; // условие выхода из рекурсии
    }
    printBin(n / 2); // напечатать все цифры, кроме последней
    System.out.print(n % 2); // вывести последнюю цифру
  }
}
