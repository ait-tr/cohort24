package homework_41;

// Создайте своё собственное исключение `IncorrectWeightException` и унаследуйте его от
// `IllegalArgumentException`.
public class IncorrectWeightException extends IllegalArgumentException {

  // Добавьте ему конструктор, в который можно передавать одно целое число.
  public IncorrectWeightException(int weight) {
    // super(); -- если ничего не написать, будет вызван вот такой конструктор супер-класса.

    // При этом супер-класс `IllegalArgumentException` должен создаваться с сообщением об ошибке
    // вида "Вес не может быть отрицательным: [некоректный вес]"
    super("Вес не может быть отрицательным: " + weight);

    // в классе-исключении никакие условия обычно не пишут и никакие проверки не проводят,
    // создание объекта этого класса равносильно нажатию на "тревожную кнопку" -
    // ошибка уже появилась, мы создали сигнал об этой ошибке
  }

  // универсальный конструктор для любого собственного исключения
  public IncorrectWeightException(String message) {
    super(message);
  }
}
