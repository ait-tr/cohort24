import java.io.*;

public class Speed {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Написать программу для вычисления скорости.
        // Получить на вход время пути и расстояние и вывести скорость.

        System.out.print("\u23F1 Введите время пути в часах: ");
        int time = Integer.parseInt(br.readLine());

        char truck = 0x26DF;
        System.out.print("Введите расстояние в километрах " + truck + ": ");
        int distance = Integer.parseInt(br.readLine());

        double speed = (double) distance / time;
        // double / int == 105.0 / 2 == 52.5
        System.out.println("Ваша скорость \u26A1: " + speed + " км/ч");
    }
}
