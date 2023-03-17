package people;

public /*abstract*/ class Child extends Human {
  // Class 'Child' must either be declared abstract or
  // implement abstract method 'retire()' in 'Human'
  // Класс "Ребёнок" или должен быть абстрактным, или
  // должен перезаписать абстрактный метод `retire()` базового класса Человек

  public Child() {
    super("Безымянный ребёнок"); // new Child() --> new Human("Безымянный ребёнок")
  }

  public Child(String name) {
    super(name);
  }

  // если этого не сделать, то класс обязан оставаться абстрактным
  @Override
  public void retire() {
    System.out.println("Ребёнок не может выйти на пенсию");
  }
}
