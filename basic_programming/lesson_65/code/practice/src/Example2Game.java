import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Example2Game {

  // предположим, мне нужно загрузить данные из файла
  // и они лежат в файле `res.txt` и читаются методом parse(file)
  // и положить в список
  private final List<String> userData;

  // для заполнения всех "начальных" значений мы делаем конструктор по умолчанию
  public Example2Game() {
    userData = new ArrayList<>(); // только в конструкторе final полям можно присваивать значения
    parse(new File("file.txt"));
  }

  private void parse(File file) {
    // здесь что-то происходит
    userData.add("Прочитанные данные"); // а вот менять приватные коллекции можно где угодно
    // главное, не менять саму ссылку -- написать userData = new LinkedList(); нельзя!
  }
}
