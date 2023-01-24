package homework.task_05_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Edition2 {
    // Написать программу, которая считывает с клавиатуры пять символов и выводит их коды.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите символ: ");
        int code = br.read(); // 'К' '\n' 'И' '\n' 'Р' '\n' 'И' '\n' 'Л' '\n' 'Л'
        System.out.println("Символ: '" + (char) code + "', код: " + code);
        code = br.read(); // Читаем '\n' (нажатие клавиши Enter, которое надо пропустить)

        System.out.print("Введите символ: ");
        code = br.read();
        System.out.println("Символ: '" + (char) code + "', код: " + code);
        code = br.read(); // Читаем '\n' (нажатие клавиши Enter, которое надо пропустить)

        System.out.print("Введите символ: ");
        code = br.read();
        System.out.println("Символ: '" + (char) code + "', код: " + code);
        code = br.read(); // Читаем '\n' (нажатие клавиши Enter, которое надо пропустить)

        System.out.print("Введите символ: ");
        code = br.read();
        System.out.println("Символ: '" + (char) code + "', код: " + code);
        code = br.read(); // Читаем '\n' (нажатие клавиши Enter, которое надо пропустить)

        System.out.print("Введите символ: ");
        code = br.read();
        System.out.println("Символ: '" + (char) code + "', код: " + code);
    }
}
