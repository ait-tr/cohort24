package people;

public class Man extends Human {

  public Man(String name) {
    super(name); // super - обращение к базовому (родительскому) классу
    // new Man - это значит, что автоматически создастся new Human
  }
}
