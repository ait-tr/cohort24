import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Efficiency {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Введите количество объектов: ");
    long n = Long.parseLong(bufferedReader.readLine());
    System.out.println("O(1) ~ 1");
    System.out.println("O(log n) ~ " + Math.log(n) / Math.log(2));
    System.out.println("O(n) ~ " + n);
    System.out.println("O(n log n) ~ " + n * Math.log(n) / Math.log(2));
    System.out.println("O(n^2) ~ " + (n * n));
    System.out.println("O(n^3) ~ " + (n * n * n));
    System.out.println("O(2^n) ~ " + Math.pow(2, n));
  }
}
