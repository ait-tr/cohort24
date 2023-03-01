import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Homework31NoComments {

  public static void main(String[] args) {
    try {
      File inputFile = new File("res/in.txt");
      BufferedReader inputFileReader = new BufferedReader(new FileReader(inputFile));

      int number = Integer.parseInt(inputFileReader.readLine());
      inputFileReader.close();

      String binaryNumber = Integer.toBinaryString(number);

      File outputFile = new File("res/out.txt");
      FileWriter outputFileWriter = new FileWriter(outputFile);
      outputFileWriter.write(binaryNumber + "\n");
      outputFileWriter.close();
    } catch (FileNotFoundException e) {
      System.err.println("File not found: " + e.getMessage());
    } catch (IOException e) {
      System.err.println("Input/output exception: " + e.getMessage());
    } catch (NumberFormatException e) {
      System.err.println("Wrong number format: " + e.getMessage());
    }
  }
}
