import java.io.*;

public class Part_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Превращение дробного числа в целое
        int intA = (int) 2.7; // 2.7 превратится в 2 -- дробная часть будет отброшена!
        System.out.println("(int) 2.7  = " + intA);

        // Превращение целого числа в дробное
        double doubleA = 3; // плохо читается, вдруг мы что-то перепутали?
        System.out.println(doubleA);
        double doubleB = 3.0; // явно хотим написать дробь // ТАК ЛУЧШЕ ВСЕГО
        System.out.println(doubleB);
        double doubleC = (double) 3; // бессмысленное с точки зрения Java преобразование
        System.out.println(doubleC);

        // Все целые числа в результате функций из Math имеют тип long
        System.out.println("Math.abs(-3) = " + Math.abs(-3)); // |-3| = 3
        System.out.println("Math.round(2.1) = " + Math.round(2.1)); // 2
        System.out.println("Math.round(3.5) = " + Math.round(3.5)); // 4
        System.out.println("Math.round(3.7) = " + Math.round(3.7)); // 4
        System.out.println("Math.ceil(3.1) = " + Math.ceil(3.1));
        System.out.println("(long) Math.ceil(3.1) = " + (long) Math.ceil(3.1));
        System.out.println("Math.floor(3.7) = " + Math.floor(3.7));
    }
}
