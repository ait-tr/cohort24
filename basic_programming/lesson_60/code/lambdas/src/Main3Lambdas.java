import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main3Lambdas {

  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
    students.add(new Student("Anton", 3));
    students.add(new Student("Boris", 2));
    students.add(new Student("Valera", 4));

    System.out.println(students);
    students.sort(new StudentScoreComparator());
    System.out.println(students);
  }
}
