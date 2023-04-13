import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main3Lambdas {

  // nested class - inner class - класс, определённый в теле другого
  // private class не будет доступен даже соседним файлам в этой папке
  private static class StudentScoreComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
      return o2.getScore() - o1.getScore(); // по убыванию среднего балла
    }
  }

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
