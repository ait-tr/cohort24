public class Main {

  public static void main(String[] args) {
//    printBin(19);
//    System.out.println("sumDig(1234) = " + sumDig(1234));
//    System.out.println(gcd(10, 15));
    System.out.println(fact(3));
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

  // алг цел sumDig(цел n)
  // нач
  //   знач := mod(n,10) // последняя цифра
  //   если n >= 10 то
  //     знач:= знач + sumDig( div(n,10) ) // рекурсивный вызов
  //   все
  //   // возврат знач
  // кон
  public static int sumDig(int n) {
    int result = n % 10; // последняя цифра
    if (n >= 10) { // не только последняя цифра, есть и другие, нужен рекурсивный вызов
      result += sumDig(n / 10); // рекурсивный вызов
    }
    return result;
  }

  // алг цел NOD(цел a, цел b)
  // нач
  //   если a=0 или b=0 то
  //     знач := a+b
  //     // возврат знач
  //     выход
  //   все
  //   если a > b то
  //     знач:= NOD(a - b, b)
  //   иначе
  //     знач:= NOD(a, b - a)
  //   все
  //   // возврат знач
  // кон
  // алгоритм Евклида
  public static int gcd(int a, int b) {
//    if (a == 0 || b == 0) {
//      return a + b; // "одно" из них 0, в сумме получится "второе"
//    }
    if (a == b) { // закончим на один шаг раньше - уменьшаем большее, пока числа не станут равны
      return a; // возвращаем любое из чисел - они равны
    }
    if (a > b) {
      return gcd(a - b, b); // вместо бОльшего - a - подставили (a - b)
    }
    return gcd(a, b - a); // вместо бОльшего - b - подставили (b - a)
  }

  // алг цел Fact(цел N)
  // нач
  //   вывод '-> N=', N, нс
  //   если N <= 1 то
  //     знач:= 1
  //   иначе
  //     знач:= N * Fact(N-1)
  //   все
  //   вывод '<- N=', N, нс
  //   // возврат знач
  // кон
  public static int fact(int n) {
    int result;
    System.out.println("-> N = " + n);
    if (n <= 1) {
      result = 1;
    } else {
      result = n * fact(n - 1);
    }
    System.out.println("<- N = " + n);
    return result;
  }
}
