import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework12_1 {
  // Красный, синий и желтый называются основными цветами, потому что их нельзя получить путем
  // смешения других цветов. При смешивании двух основных цветов получается вторичный цвет:
  // - если смешать красный и синий, то получится фиолетовый;
  // - если смешать красный и желтый, то получится оранжевый;
  // - если смешать синий и желтый, то получится зеленый.
  // Напишите программу, которая считывает названия двух основных цветов для смешивания. Если
  // пользователь вводит что-нибудь помимо названий «красный», «синий» или «желтый», то
  // программа должна вывести сообщение об ошибке. В противном случае программа должна вывести
  // название вторичного цвета, который получится в результате.

  // Формат входных данных
  // На вход программе подаются две строки, каждая на отдельной строке.

  // Формат выходных данных
  // Программа должна вывести полученный цвет смешения либо сообщение «ошибка цвета», если введён
  // был не цвет.

  // Примечание
  // Если смешать красный и красный, то получится красный.
  final public static String RED = "красный";
  final public static String BLUE = "синий";
  final public static String YELLOW = "желтый";
  final public static String ERROR = "ошибка цвета";

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String color1 = br.readLine();
    String color2 = br.readLine();

    // !color1.equals(RED) && !color1.equals(BLUE) && !color1.equals(YELLOW) - всё плохо
    // ИЛИ:
    // color1.equals(RED) || color1.equals(BLUE) || color1.equals(YELLOW) - всё хорошо
    // !(всё хорошо) -- всё плохо
    if (!(color1.equals(RED) || color1.equals(BLUE) || color1.equals(YELLOW)) ||
        !(color2.equals(RED) || color2.equals(BLUE) || color2.equals(YELLOW))) {
      // неправильный ввод
      System.out.println(ERROR);
    } else if (color1.equals(RED) && color2.equals(BLUE) ||
        color1.equals(BLUE) && color2.equals(RED)) {
      // красный - синий
      // синий - красный
      System.out.println("фиолетовый");
    } else if ((color1.equals(RED) && color2.equals(YELLOW)) ||
        (color1.equals(YELLOW) && color2.equals(RED))) {
      // красный - желтый
      // желтый - красный
      System.out.println("оранжевый");
    } else if ((color1.equals(BLUE) && color2.equals(YELLOW)) ||
        (color1.equals(YELLOW) && color2.equals(BLUE))) {
      // синий - желтый
      // желтый - синий
      System.out.println("зеленый");
    } else { // оба цвета совпадают, можно даже не проверять
      // красный - красный
      // синий - синий
      // желтый - желтый
      System.out.println(color1); // вывожу любой из них
    }
  }
}
