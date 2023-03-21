package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// интерфейс Comparable<Класс> позволяет сравнивать экземпляры Класса
// реализация этого интерфейса в классе позволяет сортировать, искать минимум и максимум в коллекции
public class Student implements Comparable<Student> {

  private String name; // имя
  private int score; // рейтинговый балл

  public Student(String name, int score) {
    this.name = name;
    this.score = score;
  }

  public static Student readStudent() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Введите имя: ");
    String name = br.readLine();
    System.out.print("Введите рейтинговый балл: ");
    int score = Integer.parseInt(br.readLine());

    return new Student(name, score);
  }

  @Override
  public String toString() {
    return name + ": " + score;
  }

  // вариант 1 - сортировка по именам
//  @Override
//  public int compareTo(Student other) {
//    // returns a negative integer, zero, or a positive integer as this object is less than,
//    // equal to, or greater than the specified object.
//
//    // возвращает отрицательное целое число, ноль или положительное целое число,
//    // поскольку этот объект меньше, равен или больше указанного объекта.
//
//    // если this < other - возвращаем любое отрицательное число (например, -1)
//    // если this == other - возвращаем 0
//    // если this > other - возвращаем любое положительное число (например, +1)
//    // условие "x < y" равносильно условию "x.compareTo(y) < 0"
////    if (/*this.*/name.compareTo(other.name) < 0) {
////      // если имя this меньше (раньше по алфавиту), чем имя other, то и студент "меньше" -
////      // должен быть раньше в списке
////      return -1;
////    }
////    if (/*this.*/name.compareTo(other.name) > 0) {
////      // если имя this больше (позже по алфавиту), чем имя other, то и студент "больше" -
////      // должен быть позже в списке
////      return 1;
////    }
////    // Если мы сюда попали, то имена совпадают. Можно вернуть 0
////    return 0;
//    return name.compareTo(other.name); // сравнить студентов - то же самое, что сравнить их имена
//  }

  // вариант 2 - сортировка по рейтингу
  // если рейтинг одинаковый, пусть сортирует по алфавиту

  @Override
  public int compareTo(Student other) {
    // x < y  --> x.compareTo(y) < 0  --> x - y < 0
    // x == y --> x.compareTo(y) == 0 --> x - y == 0
    // x > y  --> x.compareTo(y) > 0  --> x - y > 0
    // для чисел compareTo работает как "this - other"
    // this < other
    // this - other < 0
    if (/*this.*/score != other.score) { // если рейтинг не одинаковый
      return /*this.*/score - other.score; // то сравниваем рейтинг
    }
    // сюда попали, если рейтинг одинаковый, и сравниваем имена
    return /*this.*/name.compareTo(other.name);
  }
}
