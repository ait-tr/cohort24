package homework_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1v2 {
    // Напишите программу, которая читает строку, и выводит её длину, первый и последний символы.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите строку:");
        String line = br.readLine();

        System.out.printf("Длина строки: %d%n", line.length());
        System.out.printf("Перый символ: %c%n", line.charAt(0));
        System.out.printf("Последний символ: %c%n", line.charAt(line.length() - 1));
    }
}
