// класс "Пешка"
public class Pawn {

  private Color color;
  private int row;
  private int column;

  public Pawn(Color color, int row, int column) {
    this.color = color;

    checkCoordinates(row, column);
    this.row = row;
    this.column = column;
  }

  // геттер для номера строки
  // public - потому что геттер
  // не static - потому что для конкретной фигуры
  public int getRow() {
    return row;
  }

  // геттер для номера столбца
  public int getColumn() {
    return column;
  }

  // сеттеров отдельно для строки и столбца не будет - можно только менять координаты вместе
  // "сеттер" для координат
  // public, потому что сеттер
  // не static, потому что для конкретной фигуры
  public void setCoordinates(int row, int column) {
    checkCoordinates(row, column);
    int diffRow = row - this.row; // если вверх, то +, если вниз, то - (минус)
    int diffColumn = column - this.column; // если вправо, то +, если влево, то - (минус)
    if (diffRow == 0 && diffColumn == 0) {
      throw new IllegalArgumentException("Нельзя шагать на месте");
    }
    if (diffColumn != 0) { // попытались изменить столбец
      throw new IllegalArgumentException("Пешка не может двигаться по горизонтали");
    }
    if (color == Color.WHITE && diffRow < 0 || color == Color.BLACK && diffRow > 0) {
      throw new IllegalArgumentException("Пешка не может ходить назад");
    }
  }

  // проверка корректности координат
  // private - потому что "служебный"
  // static - не связан с конкретной фигурой, предварительная проверка
  private static void checkCoordinates(int row, int column) {
    if (row < 1 || row > 8) {
      throw new IllegalArgumentException("Некорректный номер строки: " + row);
      // ошибка - неправильный аргумент
      // выбрасываем её самостоятельно - теперь наш собственный код может сообщать об ошибке
      // throw (объект класса Исключение);
      // throw new КлассИсключения();
      // КлассИсключения() - конструктор по умолчанию, "просто ошибка"
      // КлассИсключения(String сообщениеОбОшибке) - ошибка "с подробностями",
      //  их видно через getMessage()
      // условие-стражник для метода, в котором нельзя просто написать return
    }

    if (column < 1 || column > 8) {
      System.out.println("Некорректный номер столбца: " + column);
      throw new IllegalArgumentException();
    }
  }
}
