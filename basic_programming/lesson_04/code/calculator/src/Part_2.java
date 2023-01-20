import java.io.*;

public class Part_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // операции:
        // Java не выдумывает новый тип, использует существующие
        // из int и long выбирает long
        // из float и double выбирает double
        // из целого и дробного всегда выбирает дробное
        // поэтому из long и float выберет float

        System.out.println("2000000000 + 2000000000 = " + 2000000000 + 2000000000); // переполнение, int + int = int
        System.out.println("2000000000L + 2000000000 = " + 2000000000L + 2000000000); // long + int = long, нет переполнения
        int x = 2000000000;
        System.out.println("x = 2000000000;\nx + x = " + x + x); // переполнение, int + int = int !!!

        // преобразование типов -- написать тип в скобочках перед переменной, числом или выражением
        // в скобочках можно писать только элементарные типы - int, long, float, double
        System.out.println("(long) x + x = " + ((long) x + x)); // long + int = long, нет переполнения
        System.out.println("(long) 2000000000 + 2000000000 = " + ((long) 2000000000 + 2000000000)); // long + int = long, нет переполнения
        System.out.println("(long) x + (long) x = " + ((long) x + (long) x)); // long + long = long, нет переполнения
        System.out.println("(long) (x + x) = " + ((long) (x + x))); // переполнение, int + int = int !!!
        // А вот результат int переделали в long, но уже поздно
    }
}
