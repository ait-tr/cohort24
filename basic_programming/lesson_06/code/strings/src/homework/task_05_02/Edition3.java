package homework.task_05_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Edition3 {
    // Написать программу, которая считывает с клавиатуры пять символов и выводит их коды.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char symbol = (char) br.read();
        System.out.println("Символ: '" + symbol + "', код: " + (int) symbol);

        symbol = (char) br.read();
        System.out.println("Символ: '" + symbol + "', код: " + (int) symbol);

        symbol = (char) br.read();
        System.out.println("Символ: '" + symbol + "', код: " + (int) symbol);

        symbol = (char) br.read();
        System.out.println("Символ: '" + symbol + "', код: " + (int) symbol);

        symbol = (char) br.read();
        System.out.println("Символ: '" + symbol + "', код: " + (int) symbol);
    }
}
