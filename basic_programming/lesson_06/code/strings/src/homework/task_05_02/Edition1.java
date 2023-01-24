package homework.task_05_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Edition1 {
    // Написать программу, которая считывает с клавиатуры пять символов и выводит их коды.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int code = br.read();
        System.out.println("Символ: '" + (char) code + "', код: " + code);

        code = br.read();
        System.out.println("Символ: '" + (char) code + "', код: " + code);

        code = br.read();
        System.out.println("Символ: '" + (char) code + "', код: " + code);

        code = br.read();
        System.out.println("Символ: '" + (char) code + "', код: " + code);

        code = br.read();
        System.out.println("Символ: '" + (char) code + "', код: " + code);
    }
}
