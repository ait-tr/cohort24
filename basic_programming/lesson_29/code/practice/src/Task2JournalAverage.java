import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2JournalAverage {

  // электронный журнал с оценками
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//    List<Integer> = ТипЗначения
//    Map<ТипКлюча, ТипЗначения>
//    Тип пары = Map.Entry<ТипКлюча, ТипЗначения>
//    Map.Entry<String, List<Integer>>
    Map<String, List<Integer>> journal = new HashMap<>();

    System.out.print("Введите количество студентов: ");
    int students = Integer.parseInt(br.readLine());
    for (int i = 0; i < students; ++i) {
      addStudent(journal);
    }

    System.out.println(journal);

    System.out.println("Введите фамилию:");
    String name = br.readLine();
    double score = calculateAverage(journal, name);
    System.out.println("Средний балл: " + score);
  }

  public static void addStudent(Map<String, List<Integer>> journal) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Введите фамилию ученика:");
    String name = br.readLine();
    List<Integer> marks = readMarks();

    journal.put(name, marks); // кладём пару "фамилия - собранный список" в журнал
  }

  // читает оценки и складывает их в список
  public static List<Integer> readMarks() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Введите количество оценок:");
    int marksAmount = Integer.parseInt(br.readLine());
    List<Integer> marks = new ArrayList<>(marksAmount); // новый список оценок конкретного студента
    for (int i = 0; i < marksAmount; ++i) {
      System.out.print("Введите оценку: ");
      int mark = Integer.parseInt(br.readLine());
      marks.add(mark); // добавляем оценку в конец списка
    }
    return marks;
  }

  public static List<Integer> getMarks(Map<String, List<Integer>> journal, String name) {
    if (journal.containsKey(name)) {
      return journal.get(name);
    } else {
      System.out.println("В журнале нет такой фамилии");
      return new ArrayList<>();
    }
  }

  public static Double calculateAverage(Map<String, List<Integer>> journal, String name) {
    List<Integer> marks = getMarks(journal, name);
    if (marks.isEmpty()) {
      return 0.0;
    }

    double sum = 0.0;
    for (int mark : marks) {
      sum += mark;
    }
    return sum / marks.size();
  }
}
