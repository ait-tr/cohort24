import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task4ArrayNumbers {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Введите количество чисел: ");
    int n = Integer.parseInt(br.readLine());

    List<Integer> numbers = new ArrayList<>();
    System.out.println("Введите " + n + " чисел:");
    for (int i = 0; i < n; ++i) {
      numbers.add(Integer.parseInt(br.readLine()));
    }

    // Вывести эти числа в обычном порядке
    System.out.println("Эти числа в обычном порядке:");
    // перебор ВСЕХ элементов массива (старого) или списка (нового) в ОБЫЧНОМ порядке без индексов
    // for-each -- для каждого элемента
    // при таком переборе нельзя ИЗМЕНИТЬ элементы (даже массива), только ПОСМОТРЕТЬ на них
    // переменная изменится, а массив или список останутся прежними
    // for (типЭлемента переменная : массивИлиСписок) {
    for (int num : numbers) {
      if (num % 3 == 0) { // только числа, кратные трём
        System.out.println(num);
      }
    }
    // обращение (или set) по индексу работает, как раньше - только так мы меняем массив или список

    // Вывести эти числа в обратном порядке
    System.out.println("Эти числа в обратном порядке:");
    for (int i = numbers.size() - 1; i >= 0; --i) {
      System.out.println(numbers.get(i));
    }
  }
}
