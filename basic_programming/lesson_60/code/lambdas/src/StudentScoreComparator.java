import java.util.Comparator;

public class StudentScoreComparator implements Comparator<Student> {

  @Override
  public int compare(Student o1, Student o2) {
    return o2.getScore() - o1.getScore(); // по убыванию среднего балла
  }
}
