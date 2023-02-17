import java.util.ArrayList;
import java.util.List;

public class Task2 {

  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(-12);
    numbers.add(-24);
    numbers.add(-2);
    for (int x = 1; x <= 5; ++x) {
      numbers.add(0, -x);
    }
    numbers.add(-7);
    numbers.add(-3);
    numbers.add(-1);

    System.out.println("numbers = " + numbers);
    System.out.println("maxList(numbers) = " + maxList(numbers));
  }

  // найти максимальный элемент списка
  public static int maxList(List<Integer> list) {
    int max = Integer.MIN_VALUE; // рамочка -- самая маленькая из технически возможных
//    int max = list.get(0); // рамочка по размеру первого яблока
    for (int apple : list) { // перебираем все яблоки, кроме первого
      if (apple > max) {
        max = apple; // увеличиваем рамочку - у нас новый максимум
      }
    }
    return max;
  }
}
