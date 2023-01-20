import java.io.*;

public class PizzaCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("=== СРАВНЯТОР ПИЦЦ ===");
        System.out.print("Введите диаметр маленькой пиццы в см: ");
        int smallDiameter = Integer.parseInt(br.readLine());
        System.out.print("Введите стоимость маленькой пиццы: ");
        double smallPrice = Double.parseDouble(br.readLine());
        System.out.print("Введите диаметр большой пиццы в см: ");
        int bigDiameter = Integer.parseInt(br.readLine());
        System.out.print("Введите стоимость большой пиццы: ");
        double bigPrice = Double.parseDouble(br.readLine());

        // Площадь круга S = pi * r^2
        // pi = 3.14 = Math.PI
        // r = d / 2 (половина диаметра)
        double smallRadius = smallDiameter / 2.0; // сделал операцию "дробной"
        double smallSquare = Math.PI * Math.pow(smallRadius, 2);
        double smallPricePerSquare = smallPrice / smallSquare;
        System.out.println("Цена за квадратный сантиметр маленькой пиццы: " + smallPricePerSquare);

        double bigRadius = bigDiameter / 2.0; // сделал операцию "дробной"
        double bigSquare = Math.PI * Math.pow(bigRadius, 2);
        double bigPricePerSquare = bigPrice / bigSquare;
        System.out.println("Цена за квадратный сантиметр большой пиццы: " + bigPricePerSquare);
    }
}
