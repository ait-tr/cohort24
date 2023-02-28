import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class Task3WriteToFile {

  public static int sum(int x, int y) {
    return x + y;
  }

  // прочитать два числа и напечатать их сумму
  public static void main(String[] args) throws IOException {
    // для открытия файла "на чтение" мы используем FileReader - разновидность InputStreamReader
    // В аргументы FileReader можно передать путь к файлу
    // класс File используется для хранения и сравнения ПУТЕЙ
    // Путь можно писать в него, а можно сразу в аргументы FileReader
//    File file = new File("input.txt");
//    FileReader fileReader = new FileReader(file);
//    BufferedReader br = new BufferedReader(fileReader);
    BufferedReader br = new BufferedReader(new FileReader("res/input.txt"));

    int x = Integer.parseInt(br.readLine()); // каждая команда readLine() читает новую строку файла
    int y = Integer.parseInt(br.readLine());
    int sum = sum(x, y);

    File outputFile = new File("res/output.txt");
    if (outputFile.createNewFile()) { // создать новый файл по указанному пути
      // выдаст ошибку, если нет папки для этого файла
      System.out.println("Создали файл");
    } else {
      System.out.println("Не получилось создать файл"); // такой файл уже есть
    }
    PrintStream outputTxt = new PrintStream(outputFile);
    // обязательно нужно заранее создать файл
    System.out.println(sum);
    outputTxt.println(sum);
    outputTxt.close();
  }
}
