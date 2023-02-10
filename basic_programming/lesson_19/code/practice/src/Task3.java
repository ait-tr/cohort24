import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

  // написать свой собственный метод возведения целых чисел в неотрицательную степень
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Введите число: ");
    int x = Integer.parseInt(br.readLine());
    System.out.print("Введите степень: ");
    int p = Integer.parseInt(br.readLine());
    System.out.println(x + " ^ " + p + " = " + pow(x, p));
  }

  public static int pow(int a, int b) { // a^b, a в степени b
    int result = 1;
    for (int i = 0; i < b; ++i) {
      result *= a;
    }
    return result;
  }
}
