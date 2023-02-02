import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Вы пришли на развилку. На развилке камень:");
    System.out.println("================================");
    System.out.println("Прямо поедешь - живым не бывать");
    System.out.println("Направо поедешь - женатым будешь");
    System.out.println("Налево поедешь - богатым будешь");
    System.out.println("================================");
    System.out.println("Куда вы пойдёте?");
    String direction = br.readLine();

//    if (direction.equals("Прямо")) {
//      System.out.println("Ну что, съели тебя!");
//    } else if (direction.equalsIgnoreCase("Направо")) {
//      System.out.println("А лучше бы съели!");
//    } else if (direction.equals("Hалево")) {
//      System.out.println("Ну и зачем оно тебе в одиночестве?");
//    } else {
//      System.out.println("Нет такого варианта!");
//    }
    // Оператор switch-case
    switch (direction) { // switch (целые числа, символы, строки, Enum)
      case "прямо":
      case "Прямо":
        System.out.println("Ну что, съели тебя!");
        break;
      case "Направо":
        System.out.println("А лучше бы съели!");
        break;
      case "Hалево":
        System.out.println("Ну и зачем оно тебе в одиночестве?");
        break;
      case "Назад":
        System.out.println("Какой-то ты нерешительный...");
        break;
      default: // значение по умолчанию -- все остальные варианты
        System.out.println("Нет такого варианта!");
        break;
    }

    System.out.println("Конец!");
  }
}
