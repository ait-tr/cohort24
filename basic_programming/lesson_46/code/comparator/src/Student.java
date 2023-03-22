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

  // по возрастанию рейтинга
  // если this < other, то отрицательное
  // если this = other, то 0
  // если this > other, то положительное
//  @Override
//  public int compareTo(Student other) {
//    return score - other.score;
//  }

  // по убыванию рейтинга
  // для сортировки по убыванию вместо сортировки по возрастанию достаточно изменить знак
  // результата compareTo():
  // - больше превратится в меньше (5 превратится в -5)
  // - равно останется равно (0 останется 0)
  // - меньше превратится в больше (-7 превратится в 7)
  @Override
  public int compareTo(Student other) {
    // если рейтинг меньше, то студент "больше" - в списке должен быть позже
    // если рейтинг больше, то студент "меньше" - в списке должен быть раньше
    // если рейтинг одинаковый, то студенты равны
    return other.score - /*this.*/score; // return -(score - other.score);
    // для убывания по алфавиту:
//    return -name.compareTo(other.name);
  }
  // ИЛИ сортировка по возрастанию + reverse
}
