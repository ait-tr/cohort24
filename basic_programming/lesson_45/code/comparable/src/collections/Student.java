package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student {

  private String name; // имя
  private int score; // рейтинговый балл

  public Student(String name, int score) {
    this.name = name;
    this.score = score;
  }

  public static Student readStudent() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Введите имя: ");
    String name = br.readLine();
    System.out.print("Введите рейтинговый балл: ");
    int score = Integer.parseInt(br.readLine());

    return new Student(name, score);
  }

  @Override
  public String toString() {
    return name + ": " + score;
  }
}
