public class Main {
  public static void main(String[] args) {
    // ТипПеременной имяПеременной = значениеПеременной;
    // String - тип "строка"
    String route = "Трасса";
    // int - тип "целое число"
    int roadNumber = 60;
    String text = "Мой любимый фильм - " + route + " " + roadNumber;
    System.out.println(text); // Мой любимый фильм - Трасса 60
    roadNumber = 66;
    text = "Мой любимый маршрут - " + route + " " + roadNumber;
    System.out.println(text); // Мой любимый маршрут - Трасса 66

    System.out.println(1 + 3); // 4
    System.out.println("1" + "3"); // 13
    System.out.println(1 + "3"); // 13
    System.out.println("1" + "3"); // 13
    System.out.println("1" + (1 + 3)); // 14
    System.out.println("1" + 1 + 3); // 113
    System.out.println(45 + 5 + "=" + 45 + 5); // 50=455
    System.out.println(45 + 5 + "=" + (45 + 5)); // 50=50
  }
}
