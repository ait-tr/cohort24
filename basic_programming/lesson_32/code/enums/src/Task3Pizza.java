import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3Pizza {

  enum PizzaSize { // размер пиццы
    SMALL, // маленькая
    MEDIUM, // средняя
    LARGE, // большая
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Выберите размер пиццы:"); // "Choose pizza size:"
    // PizzaSize.values() == [PizzaSize.SMALL, PizzaSize.MEDIUM, PizzaSize.LARGE]
    // for-each
    // for Тип переменная : наборДанных
    // в переменной по очереди оказываются все значения из набора данных
    // переменная слева от двоеточия, набор данных - справа
    for (PizzaSize size : PizzaSize.values()) {
      System.out.println("- " + size);
    }
//    PizzaSize[] sizes = PizzaSize.values();
//    for (int i = 0; i < sizes.length; ++i) {
//      System.out.println("- " + sizes[i]);
//    }

    String sizeStr = br.readLine(); // Получили "small", "Medium", "LARGE"...
    PizzaSize size = PizzaSize.valueOf(sizeStr.toUpperCase()); // превратили строку в enum
    // size = PizzaSize.SMALL
    System.out.println("Выбранный размер: " + size); // "You chose the size: "
    // дальше будем работать с enum - с ним быстрее и надёжнее
  }
}
