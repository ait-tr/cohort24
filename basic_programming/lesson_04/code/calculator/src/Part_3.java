import java.io.*;

public class Part_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = 13; // числитель
        int den = 5; // знаменатель
        System.out.println(num / den); // int / int = int - "деление с остатком"
//        13 = 5 * 2 + 3
//        Делим на 5
//        13 = 10 + 3 // 10 разделится, получится 2, и 3 останется
//        19 = 15 + 4 // 15 разделится, получится 3, и 4 останется
//        остаток всегда меньше делителя
//        если число разделилось без остатка, значит, остаток -- 0
        System.out.println("(double) num / den = " + ((double) num / den)); // double / int = double

        System.out.print("Введите делимое: ");
        int myNum = Integer.parseInt(br.readLine());
        System.out.print("Введите делитель: ");
        int myDen = Integer.parseInt(br.readLine());
        System.out.println("Неполное частное: " + (myNum / myDen)); // int / int = int - целая часть деления
        System.out.println("Остаток: " + (myNum % myDen)); // % - остаток от деления
        System.out.println("Частное: " + ((double) myNum / myDen));
    }
}
