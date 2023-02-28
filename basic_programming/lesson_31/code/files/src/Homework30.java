public class Homework30 {

  // Написать метод, который получит число и вернёт строку с его двоичной записью.
  public static String decToBin(int number) {
    if (number == 0) {
      return "0";
    }
    String result = "";
    boolean negative = number < 0;
    number = Math.abs(number);

    while (number > 0) {
      int digit = number % 2; // перебираем цифры "с конца" (справа налево)
      result = digit + result; // каждая "новая" цифра добавляется СЛЕВА
      // НЕ result += digit, потому что будет result = result + digit и цифра добавится СПРАВА
      number /= 2;
    }

//    return negative ? "-" + result : result;
    if (negative) {
      result = "-" + result;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(decToBin(-23));

    // Написать число (литерал) сразу в двоичной системе:
    int x = 0b1101; // 0bдвоичнаяЗапись
    int y = 01101; // 0восьмеричнаяЗапись
    int z = 0x1BC; // 0шестнадцатеричнаяЗапись
    System.out.println("x = " + x + ", y = " + y + ", z = " + z);
    System.out.println("x_2 = " + Integer.toBinaryString(x));
//    Integer.toBinaryString(число); // превратить int в строку с его двоичной записью
//    Integer.toOctalString(число); // превратить int в строку с его восьмеричной записью
//    Integer.toHexString(число); // превратить int в строку с его шестнадцатеричной записью

//    Integer.parseInt(строка, основаниеСистемыСчисления)
//    - превратить строку любой системы счисления в int
    int a = Integer.parseInt("1111", 2);
    System.out.println("a = " + a + ", a_2 = " + Integer.toBinaryString(a));
  }
}
