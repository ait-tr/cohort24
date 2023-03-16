package homework_41;

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
      try {
        int weight = Integer.parseInt(br.readLine()); // здесь может быть NumberFormatException
        Pizza tempPizza = new Pizza(title, weight); // здесь может быть IncorrectWeightException
        pizzas.add(tempPizza);
      } catch (IncorrectWeightException e) {
        System.out.println(e.getMessage());
        // continue; // переход к следующему шагу, если это ещё не конец
      } catch (NumberFormatException e) {
        System.out.println("Введите целое число: " + e.getMessage());
      }
    }

    System.out.println("У нас есть данные про " + pizzas.size() + " уникальных пицц:");
    int k = 1;
    for (Pizza p : pizzas) {
      System.out.println(k + ". " + p);
      ++k; // увеличиваем номер ("счётчик")
    }
  }
}
