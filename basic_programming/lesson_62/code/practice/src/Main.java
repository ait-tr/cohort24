import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

  // Используйте класс `Student` из урока 60.
  //
  // Создайте список учеников с баллами.
  //
  // Попросите пользователя ввести минимальный проходной балл.
  //
  // Выведите список учеников согласно следующим условиям:
  // - каждый ученик выведен в отдельной строке
  // - сумма баллов каждого ученика не ниже минимального проходного
  // - ученики отсортированы по убыванию среднего балла
  // - в списке не больше 10 учеников (извините, конкурс)
  //
  // Для обработки и вывода результата используйте потоки (`Stream`).
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    List<Student> students = new ArrayList<>();
    students.add(new Student("Anton", 25));
    students.add(new Student("Boris", 20));
    students.add(new Student("Valentin", 35));
    students.add(new Student("Grigoriy", 15));
    students.add(new Student("Dmitrii", 45));
    students.add(new Student("Elena", 55));
    students.add(new Student("Zakhar", 25));
    students.add(new Student("Igor", 35));
    students.add(new Student("Kirill", 1));
    students.add(new Student("Leonid", 36));
    students.add(new Student("Maria", 100));

    System.out.print("Введите минимальный проходной балл: ");
    int minScore = Integer.parseInt(bufferedReader.readLine());

    students.stream()
        .filter(s -> s.getScore() >= minScore) // выше - >, не ниже - >=
        .sorted((s1, s2) -> -(s1.getScore() - s2.getScore())) // по убыванию среднего балла
        .limit(10) // не больше 10 учеников
        .forEach(System.out::println);
  }
}
