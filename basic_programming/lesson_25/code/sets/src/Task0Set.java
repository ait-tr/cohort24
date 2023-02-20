import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task0Set {

  public static void main(String[] args) {
    // Set - множество
    // НЕТ никакого порядка и никаких индексов
    // все элементы УНИКАЛЬНЫ, не бывает повторений
    Set<Integer> numbers = new HashSet<>();
    // множество.add(элемент) - добавить элемент
    // элементы добавляются куда-нибудь - никакого порядка в общем виде в множестве нет
    // обещаний про порядок перебора во ВСЕХ множествах нет
    // у конкретных разновидностей множества могут быть конкретные обещания про порядок хранения
    numbers.add(5);
    System.out.println(numbers);
    numbers.add(7);
    System.out.println(numbers);
    numbers.add(9);
    System.out.println(numbers);
    numbers.add(25);
    System.out.println(numbers);
    numbers.add(3);
    System.out.println(numbers);
    numbers.add(7); // ничего не произошло - число 7 уже есть
    System.out.println(numbers);
    // основной смысл - БЫСТРАЯ проверка, есть ли в множестве такой элемент

    // множество.contains(элемент) - true, если элемент есть в множестве, и false, если нет
    if (numbers.contains(3)) {
      System.out.println("Число " + 3 + " есть в множестве " + numbers);
    } else {
      System.out.println("Числа " + 3 + " нет в множестве " + numbers);
    }

    if (numbers.contains(45)) {
      System.out.println("Число " + 45 + " есть в множестве " + numbers);
    } else {
      System.out.println("Числа " + 45 + " нет в множестве " + numbers);
    }

    // элементы можно перебрать через for-each
    for (Integer element : numbers) {
      System.out.println(element);
    }

    numbers.remove(4); // удаляет элемент, если он там есть
    // не будет никакой ошибки, если элемента нет
    System.out.println(numbers);

    numbers.remove(7);
    System.out.println(numbers);
    System.out.println("Размер множества - " + numbers.size());

    numbers.clear(); // очищает множество - удаляет все элементы
    System.out.println(numbers);
    System.out.println("Размер множества - " + numbers.size());
    // множество.isEmpty() - true, если пустое
  }
}
