import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class PizzaRunner {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Введите количество пицц: ");
    int n = Integer.parseInt(br.readLine());
    Set<Pizza> pizzas = new HashSet<>();
    for (int i = 0; i < n; ++i) {
      System.out.println("Ввод данных для пиццы номер " + (i + 1) + ":");
      System.out.print("  Введите название: ");
      String title = br.readLine();
      System.out.print("  Введите вес в граммах (целое число): ");
      int weight = Integer.parseInt(br.readLine());

      Pizza tempPizza = new Pizza(title, weight);
      pizzas.add(tempPizza); // при проверке уникальности объекта Java сравнивает объекты через
      // метод equals().
      // Если "нашего" метода нет, то используется Object.equals().
      // Object.equals() сравнивает ССЫЛКИ - если в памяти это два разных объекта (созданных через
      // new), то и для Object.equals() это два разных объекта.
    }

    System.out.println("У нас есть данные про " + pizzas.size() + " уникальных пицц:");
    int k = 1;
    for (Pizza p : pizzas) {
      System.out.println(k + ". " + p);
      ++k; // увеличиваем номер ("счётчик")
    }
  }
}
