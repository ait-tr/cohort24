import java.io.FileWriter;
import java.io.IOException;

public class Task4WriteToFile {

  public static void test() throws IOException {
    FileWriter fileWriter = new FileWriter("res/output.txt");
    fileWriter.write("test2\n");
    fileWriter.close();
  }

  public static void main(String[] args) throws IOException {
    FileWriter fileWriter = new FileWriter("res/output.txt");
    fileWriter.write("test1\n");
    test();
    fileWriter.write("test3\n");
    fileWriter.close();
  }
}
