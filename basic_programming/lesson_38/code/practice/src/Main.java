import students.Student;

public class Main {

  // написать базу данных студентов
  // студенты могут находиться в группах

  // прочитать количество групп
  // для каждой группы:
  // - прочитать название группы
  // - прочитать количество студентов
  // - прочитать информацию о студентах - "имя" или "имя,e-mail" для каждого в отдельной строке
  // красиво вывести состав групп на экран
  public static void main(String[] args) {
    Student student = Student.parseStudent("cohort24", "Vadim,Vadim@cohort24.info");
    Student student2 = Student.parseStudent("cohort24", "Alexey,Alexey@cohort24.info");
    Student student3 = Student.parseStudent("cohort24", "Artem,Artem@cohort24.info");
    System.out.println();
  }
}
