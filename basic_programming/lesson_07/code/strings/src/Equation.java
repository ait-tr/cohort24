import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Equation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введи три числа, каждое с новой строки: ");
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int num3 = Integer.parseInt(br.readLine());
        int sum = num1 + num2 + num3;
//        // num1 + " + " + num2 + " + " + num3 + " = " + (num1 + num2 + num3)
//        String equation = String.format("%d + %d + %d = %d", num1, num2, num3, sum);
//        System.out.println(equation);
//        System.out.println(String.format("%d + %d + %d = %d", num1, num2, num3, sum));
        // System.out.printf - форматированный вывод без переноса строки
        // - с переносом строки - в конце формата %n или \n
        System.out.printf("%d + %d + %d = %d", num1, num2, num3, sum);
    }
}
