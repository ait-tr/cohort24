import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

  // - файл Main
  // - взаимоотношения классов
  // - циклы

  // Задача:
  // программа, в которой можно будет прочитать, отредактировать и вывести на экран
  // или сохранить в файл базу данных с товарами.

  // Схема решения задачи:
  // 1. Определяем, какие классы нам необходимы
  //    - класс Item для товара
  //    - класс Money для денежных сумм
  // 1.1. Определяем поля каждого класса
  // - Определяем необходимые методы
  //   - конструктор, геттеры, сеттеры
  //   - метод для красивого вывода
  //   - возможно, какие-то ещё методы
  // - Определяем схему использования этих методов в Main
  // - либо сразу пишем методы
  // - либо сначала пишем программу в целом, используя только заготовки методов
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Map<String, Item> itemsBase = new HashMap<>(); // база "артикул - товар"

    System.out.print("Введите количество товаров: ");
    int itemsAmount = Integer.parseInt(br.readLine());
    for (int i = 1; i <= itemsAmount; ++i) {
      System.out.println("Ввод информации о товаре " + i);

      System.out.print("Введите артикул: ");
      String article = br.readLine();
      // проверяем на уникальность
      while (itemsBase.containsKey(article)) {
        System.out.println("Артикул не уникален!");
        System.out.print("Введите артикул: ");
        article = br.readLine();
      }

      System.out.print("Введите название: ");
      String title = br.readLine();

      System.out.print("Введите стоимость (дробное число): ");
      double price = Double.parseDouble(br.readLine());

      System.out.print("Введите валюту: ");
      String currency = br.readLine();

      Money itemPrice = new Money(price, currency);
      Item item = new Item(article, title, itemPrice);
      itemsBase.put(article, item);
    }

    // перебираем "значения" из базы данных товаров - то есть все товары в базе
    // в каждом товаре и так хранится его артикул
    for (Item item : itemsBase.values()) {
      System.out.println(item.getItemString());
    }
  }
}
