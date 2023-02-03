import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoneyCalc {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // вводим начальную сумму
    System.out.print("Введите стартовый капитал: ");
    long start = Long.parseLong(br.readLine()) * 100; // евро в центы

    // вводим цель (конечную сумму)
    System.out.print("Введите желаемый итог: ");
    long target = Long.parseLong(br.readLine()) * 100; // евро в центы

    // вводим ежемесячный взнос (можно 0)
    System.out.print("Вы будете делать дополнительные взносы раз в месяц? [y/n]: ");
    String add = br.readLine().toLowerCase(); // 'Y' станет 'y'
    // пока ответ (add) не равен ни одному из подходящих вариантов
    while (!add.equals("y") && !add.equals("n")) { // add != 'y' И add != 'n'
      System.out.println("Некорректный ввод:\n'y' - \"да\"\n'n' - \"нет\"");
/*    Некорректный ввод:
      'y' - "да"
      'n' - "нет" */
      add = br.readLine().toLowerCase(); // 'Y' станет 'y'
    }

    long monthlyAdd = 0L; // дополнительный ежемесячный взнос
    if (add.equals("y")) { // если пользователь решил добавить взносы
      System.out.print("Введите сумму дополнительного ежемесячного взноса: ");
      monthlyAdd = Long.parseLong(br.readLine()) * 100; // евро в центы
    }

    // вводим проценты по вкладу (процентов годовых, как в договоре)
    System.out.print("Введите проценты по вкладу (процентов годовых), только число: ");
    double percent = Double.parseDouble(br.readLine()); // Процентов в год - например, 6
    double monthlyPercent = percent / 12; // процентов в месяц - 0.5
    double monthlyRatio = monthlyPercent / 100; // переводим проценты в доли: 0.5% == 0.005

    // получаем срок, за который мы достигнем цели
    long balance = start; // переменная для баланса счёта -- записываем в первоначальный капитал
    int months = 0; // количество месяцев, которое деньги проведут в банке
    while (balance < target) { // пока мы не накопили
      // начисляем проценты на текущий баланс
      // в long нельзя записывать double - потеряется дробная часть
      // поэтому перед записью надо переделать double в long: (long) 2.5
//      balance = balance + (long) (balance * (monthlyPercent / 100));
//      balance = balance + (long) (balance * monthlyRatio);
//      balance = (long) (balance * (1 + monthlyRatio));
      balance *= (1 + monthlyRatio); // balance *= 1.005;
      // пополняем баланс
//      balance = balance + monthlyAdd;
      balance += monthlyAdd; // если клиент выбрал не пополнять, то добавим 0
      // увеличиваем количество месяцев на один -- считаем месяцы вклада
//      months = months + 1;
      ++months;
    }
    System.out.println("Вы достигнете цели через " + months + " месяцев");
  }
}
