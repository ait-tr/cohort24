import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoneyCalcNoComments {
  final public static int MONTHS_IN_YEAR = 12;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Введите стартовый капитал: ");
    long start = Long.parseLong(br.readLine()) * 100; // евро в центы

    System.out.print("Введите желаемый итог: ");
    long target = Long.parseLong(br.readLine()) * 100; // евро в центы

    System.out.print("Вы будете делать дополнительные взносы раз в месяц? [y/n]: ");
    String add = br.readLine().toLowerCase();
    while (!add.equals("y") && !add.equals("n")) {
      System.out.println("Некорректный ввод:\n'y' - \"да\"\n'n' - \"нет\"");
      add = br.readLine().toLowerCase();
    }

    long monthlyAdd = 0L;
    if (add.equals("y")) {
      System.out.print("Введите сумму дополнительного ежемесячного взноса: ");
      monthlyAdd = Long.parseLong(br.readLine()) * 100; // евро в центы
    }

    System.out.print("Введите проценты по вкладу (процентов годовых), только число: ");
    double yearlyPercent = Double.parseDouble(br.readLine()) / 100; // 6% == 0.06
    double monthlyPercent = yearlyPercent / MONTHS_IN_YEAR;

    long balance = start;
    int months = 0;
    while (balance < target) {
      balance = balance + (long) (balance * monthlyPercent);
      balance = balance + monthlyAdd;
      months = months + 1;
    }

    if (months > MONTHS_IN_YEAR) {
      int years = months / MONTHS_IN_YEAR;
      months = months % MONTHS_IN_YEAR; // months = months - years * 12;
      System.out.println("Вы достигнете цели через " + years + " лет " + months + " месяцев");
      // 7 месяцев = 7 / 12 года = 0.583 года
    } else {
      System.out.println("Вы достигнете цели через " + months + " месяцев");
    }
    System.out.printf("Ваш баланс: %.2f%n", balance / 100.0); // центы в евро
  }
}
