import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework {
    // Напишите программу, которая считывает три числа и выводит их сумму.
    // На вход подаются три целых числа в диапазоне от -10000 до 10000,
    // каждое число записано в отдельной строке.
    // Не вот так:
    // 1 2 3
    // А вот так:
    // 1
    // 2
    // 3

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        double num2 = Double.parseDouble(br.readLine());
        long num3 = Long.parseLong(br.readLine());
        System.out.println(num1 + num2 + num3);
    }
}
