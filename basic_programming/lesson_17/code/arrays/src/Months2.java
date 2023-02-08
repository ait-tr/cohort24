import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Months2 {
  // Программа получает на вход натуральное число от 1 до 12 включительно
  // Программа должна вывести название месяца и количество дней в нём (в невисокосный год)

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//    String[] monthNames = new String[12];
//    monthNames[0] = "January"; // индекс 0, а номер месяца - 1 (январь)
//    monthNames[1] = "February";
//    monthNames[2] = "March";
//    monthNames[3] = "April";
//    monthNames[4] = "May";
//    monthNames[5] = "June";
//    monthNames[6] = "July";
//    monthNames[7] = "August";
//    monthNames[8] = "September";
//    monthNames[9] = "October";
//    monthNames[10] = "November";
//    monthNames[11] = "December"; // индекс 11, а номер месяца - 12 (декабрь)

    String[] monthNames = {"January", "February", "March", "April", "May", "June", "July",
        "August", "September", "October", "November", "December"};

//    int[] monthDays = new int[12];
//    monthDays[0] = 31;
//    monthDays[1] = 28;
//    ...
    int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

//    int monthNo = Integer.parseInt(br.readLine());
//    int monthIndex = monthNo - 1; // номер 12 превратится в индекс 11
    int monthIndex = Integer.parseInt(br.readLine()) - 1; // номер 12 превратится в индекс 11
    System.out.println(monthNames[monthIndex]);
    System.out.println(monthDays[monthIndex]);
  }
}
