import java.util.ArrayList;
import java.util.List;

public class Main3Lambdas {

  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
    students.add(new Student("Anton", 3.5));
    students.add(new Student("Boris", 2.5));
    students.add(new Student("Valera", 4.3));

    System.out.println(students);
  }
}
