import java.io.*;

public class Part_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите int: ");
        int anInt = Integer.parseInt(br.readLine()); // комбинация команд "прочитать целое число"
        System.out.print("Введите long: ");
        long aLong = Long.parseLong(br.readLine()); // комбинация команд "прочитать целое число"
        System.out.print("Введите float: ");
        float aFloat = Float.parseFloat(br.readLine()); // комбинация команд "прочитать дробное число"
        System.out.print("Введите double: ");
        double aDouble = Double.parseDouble(br.readLine()); // комбинация команд "прочитать дробное число"
        String expression = anInt + " + " + aLong + " + " + aFloat + " + " + aDouble;
        System.out.println(expression + " = " + (anInt + aLong + aFloat + aDouble));
    }
}
