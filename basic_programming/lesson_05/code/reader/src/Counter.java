import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Counter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите цифру: ");
        int code = br.read();
        System.out.println("Вы ввели цифру '" + (char) code + "'");
        System.out.println("Её код в таблице символов: " + code);
        System.out.println("Код цифры 0 в таблице символов: " + (int) '0');
        // получить из цифры число - вычесть из кода этой цифры код нуля - (int) '0'
        System.out.println("Их разница: " + (code - '0'));
    }
}
