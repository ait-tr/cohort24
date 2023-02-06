public class BreakContinue {

  public static void main(String[] args) {
    for (int i = 0; i < 10; ++i) {
      if (i == 3) {
        break; // досрочно выйдет из цикла
      }
      System.out.println("i = " + i); // 3 уже не напечатает
    }
    System.out.println();

    for (int x = 0; x < 10; ++x) {
      if (x == 2 || x == 5 || x == 7) {
        continue; // досрочно завершим повторение тела цикла и сразу перейдём к шагу
        // "продолжи сразу со следующего хода"
      }
      System.out.println("x = " + x); // пропустим 2, 5 и 7
    }
    System.out.println();

    int a = 0;
    while (a < 10) {
      if (a == 2 || a == 5 || a == 7) {
//        ++a; // чтобы не зациклиться, дублируем шаг
        continue; // досрочно завершим повторение тела цикла и сразу перейдём к условию
        // "продолжи сразу со следующего хода"
      }
      System.out.println("a = " + a); // пропустим 2, 5 и 7
      ++a; // цикл while после continue не дойдёт до "шага", программа зависнет (зациклится)
    }
  }
}
