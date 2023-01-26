package homework_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    // читает --- всегда из стандартного потока ввода --- System.in
    // читает из ... --- откуда сказали
    // читает ПРОГРАММА --- пользователь в это время вводит
    // "вводится три числа" = "на вход поступает три числа" = "программа читает три числа"
    // = "программа считывает три числа" = на вход подаются три числа"

    // выводит = печатает --- программа в стандартный поток вывода --- System.out

    // Напишите программу, которая читает строку, и выводит её длину, первый и последний символы.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите строку:");
        String line = br.readLine(); // читает строку

        int lineLength = line.length(); // длина строки
        char firstSymbol = line.charAt(0); // первый символ строки
        int lastIndex = lineLength - 1; // последний ИНДЕКС строки
        char lastSymbol = line.charAt(lastIndex); // последний символ строки

        // Вывод
        System.out.println("Длина строки: " + lineLength);
        System.out.println("Перый символ: " + firstSymbol);
        System.out.println("Последний символ: " + lastSymbol);
    }
}
