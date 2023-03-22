import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsRunner {

  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
    students.add(new Student("Kirill", 35));
    students.add(new Student("Bob", 45));
    students.add(new Student("Nick", 40));

//    Collections.sort(students);
    for (Student s : students) {
      System.out.println(s);
    }
  }
}
