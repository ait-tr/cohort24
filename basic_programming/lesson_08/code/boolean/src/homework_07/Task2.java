package homework_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    // Напишите программу, которая читает:
    // - строку,
    // - левый индекс,
    // - правый индекс
    // и выводит получившуюся подстроку.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // читает
        System.out.println("Введите строку:");
        String line = br.readLine(); // строку
        System.out.println("Введите левый индекс:");
        int leftIndex = Integer.parseInt(br.readLine()); // левый индекс
        System.out.println("Введите правый индекс:");
        int rightIndex = Integer.parseInt(br.readLine()); // правый индекс

        String subString = line.substring(leftIndex, rightIndex); // получившаяся подстрока
        // левый индекс - включая
        // правый индекс - не включая (например, в endIndex можно записать длину строки)

        // выводит
        System.out.println("Получившаяся подстрока: " + subString);
//        System.out.printf("Получившаяся подстрока: %s%n", subString);
    }
}
