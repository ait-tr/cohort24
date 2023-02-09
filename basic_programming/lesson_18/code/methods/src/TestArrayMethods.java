import arrays.ArrayPrint;
import java.io.IOException;

public class TestArrayMethods {

  public static void main(String[] args) throws IOException {
    int[] chisla = ArrayPrint.readArray();
    ArrayPrint.printArray(chisla);
  }
}
