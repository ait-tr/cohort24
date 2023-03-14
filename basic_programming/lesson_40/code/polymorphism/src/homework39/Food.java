package homework39;

public class Food {

  private String title;
  private double kcal;

  public Food(String title, double kcal) {
    this.title = title;
    this.kcal = kcal;
  }

  public String getTitle() {
    return title;
  }

  public double getKcal() {
    return kcal;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setKcal(double kcal) {
    this.kcal = kcal;
  }

  public void eat() {
    System.out.printf("Вы съели %s с калорийностью %.2f ккал%n", title, kcal);
  }
}
