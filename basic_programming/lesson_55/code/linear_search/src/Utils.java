import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Utils {

  public static List<Integer> readList() throws IOException {
    List<Integer> result = new ArrayList<>();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    for (int i = 0; i < n; ++i) {
      int x = Integer.parseInt(br.readLine());
      result.add(x);
    }

    return result;
  }
}