import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {

  // Назовем число красивым, если оно является четырехзначным и делится нацело на 7 или на 17.
  // Напишите программу, определяющую, является ли введённое число красивым.
  // Программа должна вывести «YES», если число является красивым, или «NO» в противном случае.
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int number = Integer.parseInt(br.readLine());
//    if (являетсяЧетырёхзначным И (делитсяНа7 ИЛИ делитсяНа17)) {
//    if (являетсяЧетырёхзначным && (делитсяНа7 || делитсяНа17)) {
//    if (являетсяЧетырёхзначным && (number % 7 == 0 || number % 17 == 0)) {
    if ((number >= 1000 && number <= 9999) && (number % 7 == 0 || number % 17 == 0)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
