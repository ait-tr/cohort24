import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Homework31 {

  // Напишите программу, которая:
  // - прочитает целое число из файла `res/in.txt`
  // - переведёт его в двоичную запись
  // - запишет его в файл `res/out.txt`
  //
  // Воспользуйтесь методом `decToBin(int number)` из задачи 1 предыдущего урока
  // или информацией из разбора домашнего задания.

  // Нужны при копировании/передаче кода:
  // src - source - исходный код программы (файлы .java)
  // res - resources - файлы ресурсов - тексты, базы данных, картинки...

  // Не нужно копировать, сгенерируются автоматически
  // out - папка для автоматически сгененрированных файлов Java
  // .idea - служебная папка IntelliJ Idea, нужна для проекта
  public static void main(String[] args) {
    try {
      File inputFile = new File("res/in.txt"); // File - это ПутьКФайлу
      // В File мы смотрим на файл "издалека" - не трогаем, не открываем, закрыть не получится

      int number = readNumberFromFile(inputFile);

      // получить из числа строку с его двоичной записью - готовый метод Java
      String binaryNumber = Integer.toBinaryString(number);

      File outputFile = new File("res/out.txt");
      FileWriter outputFileWriter = new FileWriter(outputFile); // открываем файл для записи
      outputFileWriter.write(binaryNumber + "\n");
      outputFileWriter.close(); // правильно закрываем файл, чтобы информация записалась
      // если не написать close(), файл закроется без сохранения записанной информации
    } catch (FileNotFoundException e) {
      System.err.println("File not found: " + e.getMessage());
    } catch (IOException e) {
      System.err.println("Input/output exception: " + e.getMessage());
    }
  }

  // если не получилось прочитать число - вернём 0
  public static int readNumberFromFile(File inputFile) throws IOException {
    int result = 0;
    BufferedReader inputFileReader = new BufferedReader(new FileReader(inputFile));
    // открыли inputFile для чтения

    try {
      result = Integer.parseInt(inputFileReader.readLine());
    } catch (NumberFormatException e) {
      System.out.println("Wrong number format: " + e.getMessage());
      return -1;
    } finally { // команды, которые выполнятся в любом случае - и если ошибки не было, и если была
      System.out.println("Мы запустили finally");
      inputFileReader.close(); // закрываем файл, как только ЗАКОНЧИЛИ читать из него - ВСЁ прочитали
      // закрытие конкретного BufferedReader'а автоматически закрывает его FileReader
      // в нашем случае закрывается открытый файл "res/in.txt"
      // для каждого открытого файла будет свой собственный BufferedReader

      // обычно finally используют для освобождения занятых ресурсов (например, файлов)
    }
    // так писать сейчас НЕ НАДО - в конце метода inputFileReader закроется сам при уничтожении

    return result;
  }
}
