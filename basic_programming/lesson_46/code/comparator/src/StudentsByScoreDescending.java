import java.util.Comparator;

// Сравниватель студентов по убыванию рейтинга
public class StudentsByScoreDescending implements Comparator<Student> {

  // метод Comparator.compare() работает так же, как метод Comparable.compareTo()
  // Но Comparator "сам по себе", отдельный класс, и this не имеет никакого
  // отношения к сравниваемым объектам.
  // Метод compare() сравнивает не this и other, а o1 и o2.
  // Возвращаемое значение - такое же, как и у compareTo():
  // o1 < o2  --> отрицательное
  // o1 = o2  --> 0
  // o1 > o2  --> положительное
  @Override
  public int compare(Student o1, Student o2) {
    return o2.getScore() - o1.getScore();
  }
}
