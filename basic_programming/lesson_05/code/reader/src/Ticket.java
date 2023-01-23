import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ticket {
//    Написать программу для вычисления средней стомости поездки
//    по проездному.
//    Попросить ввести стоимость проездного на месяц
//    и количество рабочих дней.
//    Считая, что в рабочий день в среднем две поездки,
//    и 1.5 поездки в выходной,
//    посчитать и округлить общее число поездок в месяц
//    и посчитать среднюю стоимость одной поездки по проездному.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите стоимость проездного на месяц:");
        double price = Integer.parseInt(br.readLine());

        System.out.println("Введите количество рабочих дней:");
        int workingDays = Integer.parseInt(br.readLine());

        int trips = workingDays * 2;
        int holidays = 30 - workingDays;
        long holidayTrips = Math.round(holidays * 1.5);

        trips += (int) holidayTrips;
        // trips = trips + (int) holidayTrips;
        // long total = trips + holidayTrips;
        System.out.println("Среднее количество поездок за 30 дней: " + trips);

        double averagePrice = price / trips;
        averagePrice = Math.round(averagePrice * 100) / 100.0; // округлить до сотых?
        System.out.println("Средняя цена одной поездки: " + averagePrice);
    }
}
