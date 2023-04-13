public class Student {

  private String name;
  private double score; // средний балл

  public Student(String name, double score) {
    this.name = name;
    this.score = score;
  }

  public String getName() {
    return name;
  }

  public double getScore() {
    return score;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setScore(double score) {
    this.score = score;
  }

  @Override
  public String toString() {
    return name + " (" + score + ")";
  }
}
