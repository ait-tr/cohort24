import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task2WriteToFile {

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

    FileWriter outputTxt = new FileWriter("res/output.txt"); // автоматически создаёт файл
    // выдаст ошибку, если нет папки для этого файла
    System.out.println(sum);
    outputTxt.write("" + sum);
    // пишет побайтово, не умеет переходить на новую строку самостоятельно
    // если писать числа, запишет их двоичный код, а не в виде строки
    outputTxt.close();
    // обязательно нужно закрывать, иначе изменения не сохранятся
  }
}
