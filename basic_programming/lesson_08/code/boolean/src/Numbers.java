import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers {
    // Напишите программу, которая описывает введенное пользователем число
    // (оно должно находиться в диапазоне от 1 до 999),
    // указывая в строке вывода, чётное ли это число и сколько в нём цифр.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine(); // введённое пользователем число в виде строки
        int number = Integer.parseInt(line); // введённое пользователем число
        // even = чётноe = делится на 2 = делится на 2 без остатка
        // = делится на 2 с остатком 0
        // остаток от деления -- %
        // number % 2 -- остаток от деления на 2
        // (number % 2) == 0 -- остаток от деления на 2 равен 0
        // = -- команда "запиши значение в переменную", оператор присваивания
        // == -- команда "проверь равенство", оператор сравнения
        boolean even = ((number % 2) == 0); // boolean even = number % 2 == 0;
        System.out.printf("Число %d чётное: %b%n", number, even);
//        System.out.println("Число " + number + " чётное: " + even);
        System.out.printf("В числе %d есть хотя бы две цифры: %b%n", number, number > 9);
        System.out.printf("В числе %d есть три цифры: %b%n", number, number > 99);

        System.out.printf("Число %d состоит из %d цифр(ы)%n", number, line.length());

        // number % 3 -- остаток от деления на 3
    }
}
