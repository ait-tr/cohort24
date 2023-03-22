public class Student implements Comparable<Student> {

  private String name;
  private int score;

  public Student(String name, int score) {
    this.name = name;
    this.score = score;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  @Override
  public String toString() {
    return name + ": " + score;
  }

  // по возрастанию рейтинга
  // если this < other, то отрицательное
  // если this = other, то 0
  // если this > other, то положительное

  // Немного математики:
  // a < b  | +3
  // a + 3 < b + 3  -- одинаковая операция +/- к каждой части неравенства сохраняет неравенство
  // a - 4 < b - 4

  // x < y  | -y
  // x - y < y - y
  // x - y < 0

  // x > y  | -y
  // x - y > 0

  // x = y  | -y
  // x - y = 0

  // именно такое значение `x - y` (а точнее, `this - other`) и должно быть результатом
  // метода `compareTo()`
  @Override
  public int compareTo(Student other) {
    if (score < other.score) {
      return -1;
    }
    if (score > other.score) {
      return 1;
    }
    return 0;
  }
}
