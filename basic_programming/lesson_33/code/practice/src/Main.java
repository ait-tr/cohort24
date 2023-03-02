public class Main {

  // git - система контроля версий - version control system
  // git - программа, позволяющая сохранить "состояние" кода
  // и посмотреть историю его изменений

  // каждый "комплект" кода -- папка с файлами внутри -- называется "репозиторий"
  // в репозитории могут быть вложенные папки

  // коммит - "снимок" состояния кода (и других файлов)
  // Initial commit - начальный коммит - исходное состояние репозитория

  // файл '.gitignore' содержит в себе файлы и папки, которые надо
  // игнорировать - не замечать и не сохранять изменения в них

  enum Season {
    WINTER,
    SPRING,
    SUMMER,
    FALL,
  }

  public static Season getSeason(String month) {
    return switch (month.toLowerCase()) {
      case "dec", "jan", "feb" -> Season.WINTER;
      case "mar", "apr", "may" -> Season.SPRING;
      case "jun", "jul", "aug" -> Season.SUMMER;
      default -> Season.FALL;
    };
  }

  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}
