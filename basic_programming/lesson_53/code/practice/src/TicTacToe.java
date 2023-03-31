import java.io.BufferedReader;
import java.io.IOException;

public class TicTacToe { // Крестики-нолики

  private static final int SIZE = 3; // размер игрового поля
  // char[] row = new char[SIZE] // ['a', 'b', 'c']
  // char[][] field = new char[SIZE][SIZE] // [row1, row2, row3]
  // [['a', 'b', 'c'], ['d', 'e', 'f'], ['g', 'h', 'i']]
  // [['a', 'b', 'c'],
  //  ['d', 'e', 'f'],
  //  ['g', 'h', 'i']]
  char[][] field = new char[SIZE][SIZE];

  // Запуск и в конце получение результата
  // игра начинается:
  // - выводится пустое поле
  // - спрашиваются координаты крестика
  // - выводится поле с поставленным крестиком
  // - спрашиваются координаты нолика
  // - выводится поле с поставленным ноликом
  // ...
  // завершена ли игра? (проверяем состояние поля)
  //   - если да, то выводим результат
  //   - если нет, то продолжаем
  public String run(BufferedReader bufferedReader) throws IOException {
    boolean finished = false;
    while (!finished) {
      Point newPoint = readCoordinates(bufferedReader);
      // Point - координаты символа, readCoordinates - метод для их получения
      makeStep(newPoint); // makeStep - метод для того, чтобы сделать ход
      System.out.println(fieldToString());
      finished = checkField(); // checkField - метод для проверки того, завершена ли игра
    }
    return getResult(); // getResult() - метод для получения строки с результатом
  }

  private String getResult() {
    // TODO
    return "Здесь будет результат";
  }

  private boolean checkField() {
    // TODO
    return true;
  }

  private void makeStep(Point newPoint) {
    // координаты 1..3 превращаем в индексы 0..2
    field[newPoint.getX() - 1][newPoint.getY() - 1] = 'X';
  }

  private Point readCoordinates(BufferedReader bufferedReader) throws IOException {
    Point result = Point.read(bufferedReader);
    checkCoordinates(result); // проверка, попадают ли координаты на поле
    return result;
  }

  private void checkCoordinates(Point result) {
    int x = result.getX();
    int y = result.getY();
    if (x < 1 || x > SIZE) {
      throw new IllegalArgumentException("Некорректная координата x: " + x);
    }
    if (y < 1 || y > SIZE) {
      throw new IllegalArgumentException("Некорректная координата y: " + y);
    }
  }

  public String fieldToString() {
    String result = "";

    char CORNER = '+';
    char HORIZONTAL = '-';
    char VERTICAL = '|';

    // горизонтальный разделитель
    result += CORNER;
    for (int i = 0; i < SIZE; ++i) {
      result += HORIZONTAL;
      result += CORNER;
    }
    result += "\n";

    for (int rowI = 0; rowI < SIZE; ++rowI) {
      result += VERTICAL;
      for (int colI = 0; colI < SIZE; ++colI) {
        result += field[rowI][colI];
        result += VERTICAL;
      }
      result += "\n";
      // горизонтальный разделитель
      result += CORNER;
      for (int i = 0; i < SIZE; ++i) {
        result += HORIZONTAL;
        result += CORNER;
      }
      result += "\n";
    }

    return result;
  }
}
