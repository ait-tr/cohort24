public class Pizza {

  private String title;
  private int weight;

  public Pizza(String title, int weight) {
    this.title = title;
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "Пицца '" + title + "' весом " + weight + " г";
  }
}
