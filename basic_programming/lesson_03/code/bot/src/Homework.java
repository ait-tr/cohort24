// Программа, которая выводит на экран информацию о вас (или выдуманном персонаже) в три строчки.
// "Меня зовут ..."
// "Мне ... лет"
// "Я из ..."
// На месте многоточий должны использоваться переменные!

public class Homework {
  public static void main(String[] args) {
    String name = "Кирилл";
    System.out.println("Меня зовут " + name + ".");
    System.out.println("Привет, " + name + "!" );

    int age = 25;
    System.out.println("Мне " + age + " лет.");
    int target = 60;
    System.out.println("Через " + (target - age) + " лет мне будет " + target + " лет.");
    target = 70;
    System.out.println("Через " + (target - age) + " лет мне будет " + target + " лет.");

    String place = "Китая";
    System.out.println("Я из " + place + ".");
  }
}
