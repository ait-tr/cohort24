import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main3Lambdas {

  // nested class - inner class - класс, определённый в теле другого
  // private class не будет доступен даже соседним файлам в этой папке
//  private static class StudentScoreComparator implements Comparator<Student> {
//
//    @Override
//    public int compare(Student o1, Student o2) {
//      return o2.getScore() - o1.getScore(); // по убыванию среднего балла
//    }
//  }

  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
    students.add(new Student("Anton", 3));
    students.add(new Student("Boris", 2));
    students.add(new Student("Valera", 4));

    System.out.println(students);
    // 1. Отдельный файл с компаратором
    // 2. Компаратор как внутренний класс
//    Comparator<Student> comparator = new StudentScoreComparator();
//    students.sort(comparator);
//    students.sort(new StudentScoreComparator());

    // 3. Анонимный класс - одноразовый класс, определённый прямо в теле программы
    // Часто это анонимный класс - наследник абстрактного класса
    // с реализацией "не хватающих" абстрактных методов
//    students.sort(new Comparator<Student>() {
//      @Override
//      public int compare(Student o1, Student o2) {
//        return o2.getScore() - o1.getScore(); // по убыванию среднего балла
//      }
//    });

    // 4. Использовать лямбда-функцию
    // Лямбда-функции или просто лямбда в Java — это анонимные функции, которые можно сохранять
    // и передавать как анонимные классы, реализующие абстрактный функциональный интерфейс.
    // Функциональный интерфейс в Java — интерфейс, в котором объявлен только один
    // метод и он абстрактный (например, компаратор).
    // аргумент -> возвращаемоеЗначение
    // (аргумент1, аргумент2) -> возвращаемоеЗначение
    // аргумент -> { команда1; return возвращаемоеЗначение; }
    // (аргумент1, аргумент2) -> { команда1; return возвращаемоеЗначение; }
    // () -> значение

    // по убыванию среднего балла
    students.sort((Student o1, Student o2) -> o2.getScore() - o1.getScore());
//    students.sort((Student o1, Student o2) -> {
//      int score1 = o1.getScore();
//      int score2 = o2.getScore();
//      return score2 - score1;
//    });
    System.out.println(students);
  }
}
