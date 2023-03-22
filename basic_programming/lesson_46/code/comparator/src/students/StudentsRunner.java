package students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentsRunner {

  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
    students.add(new Student("Kirill", 35));
    students.add(new Student("Bob", 45));
    students.add(new Student("Nick", 40));

    Collections.sort(students);
    System.out.println("По алфавиту:");
    for (Student s : students) {
      System.out.println(s);
    }

    // Предположим, что мне для отметок посещаемости нужен список по алфавиту,
    // а для определения успеваемости нужен список по убыванию рейтинга.

    // Переопределять compareTo не подходит - такой метод в классе только один
    // "Все студенты нашей программы всегда сравниваются по алфавиту"
    // "Все студенты нашей программы всегда сравниваются по рейтингу"
    // - именно такие выражения описывает compareTo().
    // Интерфейс Comparable описывает сравнение "как обычно" - натуральную сортировку.
    // Он должен описывать то сравнение, которое будет использовано чаще всего, без дополнительных
    // уточнений.

    // Для "временного" - одноразового или многоразового - сравнения "не как обычно" используются
    // отдельные (!) классы, реализующие другой интерфейс - Comparator
    // Comparable - сравнимый - "в принципе" можно сравнивать
    // Comparator - сравниватель (сравнятор) - класс, позволяющий сравнить "в этот раз"
    // Предположим, что обычно объекты сравнивать нельзя или сравниваются не так, поэтому
    // в данный конкретный раз мы используем "свой собственный сравниватель".
    // Collections.sort(list) - сортировка при помощи compareTo() - "натуральная сортировка"
    // Collections.sort(list, comparator) - сортировка при помощи компаратора
    // list.sort(comparator) - сортировка списка при помощи компаратора
    Comparator<Student> comparator = new StudentsByScoreDescending();
    Collections.sort(students, comparator);
//    students.sort(new StudentsByScoreDescending());
    // после sort список всегда "по возрастанию"
    System.out.println("По убыванию рейтинга:");
    for (Student s : students) {
      System.out.println(s);
    }

    System.out.println("Худший ученик:");
    System.out.println(Collections.max(students, comparator));
    // max - самый большой - самый конец списка

    System.out.println("Лучший ученик:");
    System.out.println(Collections.min(students, comparator));
    // min - самый маленький - самое начало списка
  }
}
