import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintSmth {
  public static void povtoriStroku(String stroka, int kolichestvo) {
    for (int i = 0; i < kolichestvo; ++i) {
      System.out.println(stroka);
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Введите строку для повторения:");
    String line = br.readLine();

    System.out.print("Введите количество повторений: ");
    int n = Integer.parseInt(br.readLine());

    povtoriStroku(line, n);
  }
}
