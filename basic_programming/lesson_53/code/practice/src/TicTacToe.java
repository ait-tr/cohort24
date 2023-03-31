public class TicTacToe { // Крестики-нолики

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
  public String run() {
    boolean finished = false;
    while (!finished) {
      Point newPoint = readCoordinates();
      // Point - координаты символа, readCoordinates - метод для их получения
      makeStep(newPoint); // makeStep - метод для того, чтобы сделать ход
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
    // TODO
  }

  private Point readCoordinates() {
    Point result = Point.read();
    checkCoordinates(result); // проверка, попадают ли координаты на поле
    return result;
  }

  private void checkCoordinates(Point result) {
    // TODO
  }
}
